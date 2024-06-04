package lk.ijse.spring.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
}
