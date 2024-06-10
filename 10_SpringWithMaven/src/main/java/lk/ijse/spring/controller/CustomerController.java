package lk.ijse.spring.controller;

import lk.ijse.spring.dto.CustomerDTO;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

/**
 * @Created By Ravindu Prathibha
 * @created 6/10/2024 - 2:46 PM
 * @project Spring_Framework
 */
@RestController
@RequestMapping("api/v1/customer")
@CrossOrigin
public class CustomerController {

    @GetMapping
    public ArrayList<CustomerDTO>getAllCustomers(){
        ArrayList<CustomerDTO> arrayList = new ArrayList<>();
        arrayList.add(new CustomerDTO("C001","Ravindu","Bandaragama",100000));
        arrayList.add(new CustomerDTO("C002","Kamal","Panadura",20000));
        arrayList.add(new CustomerDTO("C003","Nimal","Colombo",30000));
        return arrayList;
    }
}
