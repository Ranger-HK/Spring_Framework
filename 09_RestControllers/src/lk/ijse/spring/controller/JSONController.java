package lk.ijse.spring.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
}
