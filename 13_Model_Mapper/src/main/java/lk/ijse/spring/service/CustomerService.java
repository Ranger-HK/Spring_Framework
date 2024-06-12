package lk.ijse.spring.service;

import lk.ijse.spring.dto.CustomerDTO;

import java.util.List;

/**
 * @Created By Ravindu Prathibha
 * @created 6/11/2024 - 7:03 PM
 * @project Spring_Framework
 */
public interface CustomerService {
    void saveCustomer(CustomerDTO customerDTO);

    void deleteCustomer(String id);

    void updateCustomer(CustomerDTO customerDTO);

    CustomerDTO searchCustomer(String id);

    List<CustomerDTO> getAllCustomers();
}
