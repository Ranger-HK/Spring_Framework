package lk.ijse.spring.controller;

import lk.ijse.spring.dto.CustomerDTO;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Created By Ravindu Prathibha
 * @created 6/5/2024 - 11:38 AM
 * @project Spring_Framework
 */
@RestController
@RequestMapping("form")
public class FormDataController {

    @PostMapping
    public String testForm1(@ModelAttribute CustomerDTO dto){
        return "Request Received"+dto.toString();
    }

}
