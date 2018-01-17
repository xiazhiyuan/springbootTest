package com.example.demo.web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by 123 on 2018/1/15.
 */
@RestController
public class HelloController {
    @RequestMapping("/hello")
    public String index(){
        return "hello word" ;
    }

}
