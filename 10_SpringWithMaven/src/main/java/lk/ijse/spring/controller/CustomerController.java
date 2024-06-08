package lk.ijse.spring.controller;

import lk.ijse.spring.dto.CustomerDTO;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Created By Ravindu Prathibha
 * @created 6/8/2024 - 2:23 PM
 * @project Spring_Framework
 */
@RestController
@RequestMapping("customer")
public class CustomerController {

   /* @GetMapping
    public String getAllCustomers(){
        return "Hello Maven";
    }*/

    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE) //content-type=application/json
    public CustomerDTO getAllCustomers() {
        return new CustomerDTO("C001", "Ravindu", "Bandaragama", 100000.00);
    }
}
