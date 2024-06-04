package lk.ijse.spring.controller;

import org.springframework.web.bind.annotation.*;

/**
 * @Created By Ravindu Prathibha
 * @created 6/4/2024 - 3:52 PM
 * @project Spring_Framework
 */
@RestController
@RequestMapping("customer")
public class CustomerController {
    public CustomerController() {
        System.out.println("Controller");
    }

    @RequestMapping
    public String getAllCustomer(){
        return "Hello Customer";
    }

    @PostMapping
    public String saveCustomer(){
        return "Customer Save and Post Method Invoked";
    }

    @DeleteMapping
    public String deleteCustomer(){
        return "Customer Delete and Delete Method Invoked";
    }

    @PutMapping
    public String updateCustomer(){
        return "Customer Update and Update Method Invoked";
    }
}
