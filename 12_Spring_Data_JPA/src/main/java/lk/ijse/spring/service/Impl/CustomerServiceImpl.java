package lk.ijse.spring.service.Impl;

import lk.ijse.spring.entity.Customer;
import lk.ijse.spring.repo.CustomerRepo;
import lk.ijse.spring.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

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


    @Override
    public void saveCustomer(Customer entity) {
        if (!customerRepo.existsById(entity.getId())) {
            customerRepo.save(entity);
        } else {
            throw new RuntimeException("Customer Already Exist...!");
        }
    }

    @Override
    public void deleteCustomer(String id) {
        customerRepo.deleteById(id);

    }

    @Override
    public void updateCustomer(Customer entity) {
        if (customerRepo.existsById(entity.getId())) {
            customerRepo.save(entity);
        } else {
            throw new RuntimeException("No Such Customer To Update..! Please Check the ID..!");
        }

    }

    @Override
    public Customer searchCustomer(String id) {
        return customerRepo.findById(id).get();
    }

    @Override
    public List<Customer> getAllCustomers() {
        return customerRepo.findAll();
    }
}




