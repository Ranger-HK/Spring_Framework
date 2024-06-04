package lk.ijse.spring.controller;

import org.springframework.web.bind.annotation.*;

/**
 * @Created By Ravindu Prathibha
 * @created 6/4/2024 - 4:45 PM
 * @project Spring_Framework
 */
@RestController
@RequestMapping("item")
public class ItemController {

    @GetMapping
    public String getAllItems(){
        return "All Items Get and Get Method Invoked";
    }


}
