package lk.ijse.spring.controller;

import lk.ijse.spring.dto.CustomerDTO;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

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
    public ArrayList<CustomerDTO> getAllCustomers() {
        ArrayList<CustomerDTO> arrayList = new ArrayList<>();
        arrayList.add(new CustomerDTO("C001", "Ravindu", "Bandaragama", 100000));
        arrayList.add(new CustomerDTO("C002", "Kamal", "Panadura", 20000));
        arrayList.add(new CustomerDTO("C003", "Nimal", "Colombo", 30000));
        return arrayList;
    }


    @GetMapping(path = "/{id}")
    public CustomerDTO searchCustomer(@PathVariable String id) {
        return new CustomerDTO(id, "Dasun", "Kadawatha", 1000);
    }


    @PostMapping(consumes = {MediaType.APPLICATION_JSON_VALUE})
    public CustomerDTO saveCustomer(@ModelAttribute CustomerDTO dto) {
        return dto;
    }

    @PutMapping(consumes = {MediaType.APPLICATION_JSON_VALUE})
    public CustomerDTO updateCustomer(@RequestBody CustomerDTO dto) {
        System.out.println(dto.toString());
        return dto;
    }

    @DeleteMapping(params = {"id"})
    public CustomerDTO deleteCustomer(@RequestParam String id) {
        return new CustomerDTO(id, "Dasun", "Kadawatha", 1000);
    }


}
