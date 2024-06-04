package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Created By Ravindu Prathibha
 * @created 6/3/2024 - 3:34 PM
 * @project Spring_Framework
 */
@Controller
@RequestMapping("customer")
public class ControllerTwo {

    @GetMapping
    public String testMethod(){
       return "customer";
    }
}
