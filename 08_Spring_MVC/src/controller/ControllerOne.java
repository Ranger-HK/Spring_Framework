package controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Created By Ravindu Prathibha
 * @created 6/3/2024 - 3:34 PM
 * @project Spring_Framework
 */
@RestController
@RequestMapping("controllerone")
public class ControllerOne {

    public ControllerOne() {
        System.out.println("Controller One Instantiated");
    }

    @GetMapping
    public void testMethod(){
        System.out.println("Requests Received");
    }
}
