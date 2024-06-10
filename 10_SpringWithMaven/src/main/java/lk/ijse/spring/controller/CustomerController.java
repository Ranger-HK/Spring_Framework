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

    //consumes --> application/json (requests body should include content-type=application/json
    @GetMapping(consumes = MediaType.APPLICATION_JSON_VALUE) //content-type=application/json
    public CustomerDTO searchCustomer() {
        return new CustomerDTO("C002", "Ravindu", "Bandaragama", 100000.00);
    }


    //consumes = if we put consumes type that means you have to put content type header in the request
    //produce = if you want to state that what you are going to produce from here you can use produced header
    //also put the accept header in the request header
    @GetMapping(consumes = "application/json",produces = "application/json")
    public CustomerDTO testMethod(){
        return new CustomerDTO("C002", "Ravindu", "Bandaragama", 100000.00);

    }
}
