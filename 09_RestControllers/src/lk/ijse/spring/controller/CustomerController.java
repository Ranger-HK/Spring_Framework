package lk.ijse.spring.controller;

import org.springframework.web.bind.annotation.*;

/**
 * @Created By Ravindu Prathibha
 * @created 6/4/2024 - 3:52 PM
 * @project Spring_Framework
 */
@RestController
@RequestMapping("customer") //Handler Mapping
public class CustomerController {

    @GetMapping //Handler Mapping
    //Handler Method
    public String getAllCustomer(){
        return "All Customer Get and Get Method Invoked";
    }

   /*
   Error-- Cant Use Same Method Towise in same controller

   @GetMapping //Handler Mapping
    //Handler Method
    public String searchCustomer(){
        return "Customer Search and Post Method Invoked";
    }*/

    //Solution For It - use Attribute

     @GetMapping(path = "search") //Handler Mapping
    //Handler Method
    public String searchCustomer(){
        return "Customer Search and Post Method Invoked";
    }

    @PostMapping//Handler Method
    // Handler Method
    public String saveCustomer(){
        return "Customer Save and Post Method Invoked";
    }

    @DeleteMapping//Handler Method
    // Handler Method
    public String deleteCustomer(){
        return "Customer Delete and Delete Method Invoked";
    }

    @PutMapping//Handler Method
    // Handler Method
    public String updateCustomer(){
        return "Customer Update and Put Method Invoked";
    }
}
