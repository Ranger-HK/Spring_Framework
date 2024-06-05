package lk.ijse.spring.controller;

import lk.ijse.spring.dto.CustomerDTO;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

/**
 * @Created By Ravindu Prathibha
 * @created 6/5/2024 - 2:05 PM
 * @project Spring_Framework
 */
@RestController
@RequestMapping("json")
public class JSONController {

    @PutMapping
    public String getJsonRequest(){
      return "Hello Json";
    }

    @PostMapping //if you want to get request content you have to use @RequestBody
    public String getJsonRequest(@RequestBody CustomerDTO dto){
      return "Hello Json hi"+dto.toString();
    }

    //To return json response you need json converter in the classpath
    @GetMapping(produces = {MediaType.APPLICATION_JSON_VALUE}) //content-type=application/json
    public CustomerDTO sendBackJSON(){
      return new CustomerDTO("C001","Dasu","Colombo",100.00);
    }


    @GetMapping(path = "array",produces = {MediaType.APPLICATION_JSON_VALUE}) //content-type=application/json
    public ArrayList<CustomerDTO> sendBackJSONArray(){
        ArrayList<CustomerDTO> objects = new ArrayList<>();
        objects.add(new CustomerDTO("C001","Dasu","Colombo",100.00));
        objects.add(new CustomerDTO("C002","Ravi","Bandaragama",100.00));
        objects.add(new CustomerDTO("C003","Kamal","Panadura",100.00));
        return objects;
    }
}
