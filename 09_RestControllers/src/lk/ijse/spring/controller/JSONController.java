package lk.ijse.spring.controller;

import lk.ijse.spring.dto.CustomerDTO;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

/**
 * @Created By Ravindu Prathibha
 * @created 6/5/2024 - 2:05 PM
 * @project Spring_Framework
 */
@RestController
@RequestMapping("json")
public class JSONController {

  /*  @PutMapping
    public String getJsonRequest(){
      return "Hello Json";
    }

    @PostMapping
    public String getJsonRequest(CustomerDTO dto){
      return "Hello Json"+dto.toString();
    }
    */

    @GetMapping(produces = {MediaType.APPLICATION_JSON_VALUE}) //content-type=application/json
    public CustomerDTO sendBackJSON(){
      return new CustomerDTO("C001","Dasu","Colombo",100.00);
    }
}
