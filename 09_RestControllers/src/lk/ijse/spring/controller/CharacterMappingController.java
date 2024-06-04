package lk.ijse.spring.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Created By Ravindu Prathibha
 * @created 6/4/2024 - 5:16 PM
 * @project Spring_Framework
 */
@RestController
@RequestMapping("char")
public class CharacterMappingController {

    //out put
    //it/i12
    //12/test2

    @GetMapping(path = "it/i??")
    public String test1(){
        return "Get Mapping Invoked - test 1";
    }

    @GetMapping(path = "??/test2")
    public String test2(){
        return "Get Mapping Invoked - test 2";
    }

}
