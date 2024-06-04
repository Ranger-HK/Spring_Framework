package lk.ijse.spring.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Created By Ravindu Prathibha
 * @created 6/4/2024 - 5:08 PM
 * @project Spring_Framework
 */
@RestController
@RequestMapping("exact")
public class ExactMappingController {

   // Exact Mapping = .../exact/it/test1
   // Exact Mapping = .../exact/it/test2
   // path segment = /it/

    @GetMapping(path = "it/test1")
    public String test1(){
        return "Get Mapping Invoked - test 1";
    }

    @GetMapping(path = "it/test2")
    public String test2(){
        return "Get Mapping Invoked - test 2";
    }
}
