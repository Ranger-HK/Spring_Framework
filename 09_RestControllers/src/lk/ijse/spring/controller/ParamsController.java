package lk.ijse.spring.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Created By Ravindu Prathibha
 * @created 6/5/2024 - 10:58 AM
 * @project Spring_Framework
 */
@RestController
@RequestMapping("params")
public class ParamsController {

   /* @GetMapping(params = {"id","name"})
    public String test1(){
        return "Hello 1";
    }*/

   /* @GetMapping(params = {"id","name"})
    public String test1(String id,String name){
        return "Hello 1"+" "+id+" "+name;
    }

    @GetMapping
    public String test2(){
        return "Hello 2";
    }*/

   /* //Error
    @GetMapping(params = {"name","salary"})
    public String test3(String name,double mySalary){
        return "Hello 3"+" "+name+" "+mySalary;
    }*/

   /* //Fix Using @RequestParam
    @GetMapping(params = {"name","salary"})
    public String test3(@RequestParam String name,@RequestParam("salary") double mySalary){
        return "Hello 3"+" "+name+" "+mySalary;
    }*/


    //use path and params
    @GetMapping(path = "one",params = {"id"})
    public String test1(String id){
        return "Hello 1"+" "+id;
    }

}
