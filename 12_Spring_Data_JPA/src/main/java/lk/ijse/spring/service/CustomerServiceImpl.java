package lk.ijse.spring.service;

import lk.ijse.spring.entity.Customer;
import lk.ijse.spring.repo.CustomerRepo;
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
public class CustomerServiceImpl {

    @Autowired
    private CustomerRepo customerRepo;

    public void saveCustomer(Customer entity) {
        customerRepo.save(entity);
    }

    public void deleteCustomer(String id) {
        customerRepo.deleteById(id);

    }

    public void updateCustomer(Customer entity) {
        customerRepo.save(entity);

    }

    public Customer searchCustomer(String id) {
        return customerRepo.findById(id).get();
    }

    public List<Customer> getAllCustomer() {
        return customerRepo.findAll();
    }
}




