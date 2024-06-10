package lk.ijse.spring.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Created By Ravindu Prathibha
 * @created 6/10/2024 - 5:46 PM
 * @project Spring_Framework
 */
@RestController
@RequestMapping("api/v1/customer")
@CrossOrigin
public class CustomerController {

    @GetMapping
    public String getAllCustomers(){
        return "Hello App Is Working";
    }
}
