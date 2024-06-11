package lk.ijse.spring.controller;

import lk.ijse.spring.entity.Customer;
import lk.ijse.spring.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @Created By Ravindu Prathibha
 * @created 6/10/2024 - 5:46 PM
 * @project Spring_Framework
 */
@RestController
@RequestMapping("api/v1/customer")
@CrossOrigin
public class CustomerController {

    @Autowired
    CustomerService customerService;

    @GetMapping
    public List<Customer> getAllCustomers() {
        return customerService.getAllCustomers();
    }

    @PostMapping
    public void saveCustomer(@ModelAttribute Customer customer){
        customerService.saveCustomer(customer);
    }

    @PutMapping
    public void updateCustomer(@RequestBody Customer customer){
        customerService.updateCustomer(customer);
    }

    @DeleteMapping(params = {"id"})
    public void deleteCustomer(@RequestParam String id){
        customerService.deleteCustomer(id);
    }

    @GetMapping(path = "/{id}")
    public Customer searchCustomer(@PathVariable String id){
        return customerService.searchCustomer(id);
    }
}
