package lk.ijse.spring.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Created By Ravindu Prathibha
 * @created 6/4/2024 - 5:44 PM
 * @project Spring_Framework
 */
@RestController
@RequestMapping("variable")
public class PathVariableController {

   /* http://localhost:8080/09_RestControllers_Web_exploded/variable/I001"
    (variable) path segment
    (I0001) path segment

    In spring we can retrive values of path segments
    To Do that we have to create path variables ->{1001}*/


  /*  @GetMapping(path = "{I001}")
    public String test(@PathVariable("I001") String itemcode){
        return itemcode;
    }*/

    @GetMapping(path = "{id}")
    public String test1(@PathVariable String id){
        return id;
    }

    @GetMapping(path = "{id}") // setting alias when parameter names
    public String test2(@PathVariable("id") String itemcode){
        return itemcode;
    }


    @GetMapping(path = "{id}/{name}")
    public String test3(@PathVariable String id, @PathVariable String name){
        return id+""+name;
    }

}
