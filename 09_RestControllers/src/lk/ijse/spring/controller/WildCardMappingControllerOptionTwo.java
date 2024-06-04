package lk.ijse.spring.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Created By Ravindu Prathibha
 * @created 6/4/2024 - 5:26 PM
 * @project Spring_Framework
 */
@RestController
@RequestMapping("wildtwo")
public class WildCardMappingControllerOptionTwo {

    //Matches One or More Characters in path segment
    //it/**/test -- > it/sdsdsds/test
    //it/**/** -- > it/sdsdsds/dfdfddd

    @GetMapping(path = "it/**/test")
    public String test1(){
        return "Get Mapping Invoked - test 1";
    }

    @GetMapping(path = "it/*  */**")
    public String test2(){
        return "Get Mapping Invoked - test 2";
    }
}
