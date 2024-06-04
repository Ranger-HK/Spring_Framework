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

    @GetMapping //Handler Method
    public String getAllCustomer(){
        return "Hello Customer";
    }

    @PostMapping//Handler Method
    public String saveCustomer(){
        return "Customer Save and Post Method Invoked";
    }

    @DeleteMapping//Handler Method
    public String deleteCustomer(){
        return "Customer Delete and Delete Method Invoked";
    }

    @PutMapping//Handler Method
    public String updateCustomer(){
        return "Customer Update and Put Method Invoked";
    }
}
