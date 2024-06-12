package lk.ijse.spring.service.Impl;

import lk.ijse.spring.dto.CustomerDTO;
import lk.ijse.spring.entity.Customer;
import lk.ijse.spring.repo.CustomerRepo;
import lk.ijse.spring.service.CustomerService;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

/**
 * @Created By Ravindu Prathibha
 * @created 6/11/2024 - 5:09 PM
 * @project Spring_Framework
 */
@Service
@Transactional
public class CustomerServiceImpl implements CustomerService {

    @Autowired
    private CustomerRepo customerRepo;

    @Autowired
    private ModelMapper mapper;

    @Override
    public List<CustomerDTO> getAllCustomers() {

       /* List<Customer> all = customerRepo.findAll();
        List<CustomerDTO> arrayList = new ArrayList<>();
        for (Customer customer : all) {
            arrayList.add(new CustomerDTO(customer.getId(), customer.getName(), customer.getAddress(), customer.getSalary()));
        }

        return arrayList;*/

        List<Customer> all = customerRepo.findAll();
        return mapper.map(all,new TypeToken< List<CustomerDTO>>(){}.getType());

    }

    @Override
    public void saveCustomer(CustomerDTO customerDTO) {
        if (!customerRepo.existsById(customerDTO.getId())) {

            // 01.Source --> Main Source
            // 02.Destination Type --> Class Type Which We Want To Convert The Source
            //Convert DTO To Entity
            Customer entity = mapper.map(customerDTO, Customer.class);//source and destination type

            // Customer customer = new Customer(customerDTO.getId(), customerDTO.getName(), customerDTO.getAddress(), customerDTO.getSalary());

            customerRepo.save(entity);
        } else {
            throw new RuntimeException("Customer Already Exist...!");
        }
    }

    @Override
    public void deleteCustomer(String id) {
        if (customerRepo.existsById(id)) {
            customerRepo.deleteById(id);
        } else {
            throw new RuntimeException("Please Check the ID..! No Such Customer");

        }
    }

    @Override
    public void updateCustomer(CustomerDTO customerDTO) {
        if (customerRepo.existsById(customerDTO.getId())) {

            //Convert DTO To Entity
            Customer entity = mapper.map(customerDTO, Customer.class);
            //Customer customer = new Customer(customerDTO.getId(), customerDTO.getName(), customerDTO.getAddress(), customerDTO.getSalary());

            customerRepo.save(entity);
        } else {
            throw new RuntimeException("No Such Customer To Update..! Please Check the ID..!");
        }

    }



    @Override
    public CustomerDTO searchCustomer(String id) {
        if (customerRepo.existsById(id)) {

            Customer customer = customerRepo.findById(id).get();

            //Convert Entity To DTO
            return mapper.map(customer, CustomerDTO.class);
            //return new CustomerDTO(customer.getId(), customer.getName(), customer.getAddress(), customer.getSalary());

        } else {
            throw new RuntimeException("No Customer For" + id + "..!");
        }
    }

}




