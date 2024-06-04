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
@RequestMapping("controllerone") //Handler Method
public class ControllerOne {

    public ControllerOne() {
        System.out.println("Controller One Instantiated");
    }

    @GetMapping //Handler Method
    public void testMethod(){
        System.out.println("Requests Received");
    }
}
