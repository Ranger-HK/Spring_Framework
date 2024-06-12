package lk.ijse.spring.service;

import lk.ijse.spring.entity.Customer;

import java.util.List;

/**
 * @Created By Ravindu Prathibha
 * @created 6/11/2024 - 7:03 PM
 * @project Spring_Framework
 */
public interface CustomerService {
    void saveCustomer(Customer entity);

    void deleteCustomer(String id);

    void updateCustomer(Customer entity);

    Customer searchCustomer(String id);

    List<Customer> getAllCustomers();
}
