package com.beanwf.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.beanwf.poto.Person;

@RestController
public class HelloWorldController{
    @Autowired
    Person p;

    @RequestMapping("/hello")
    public String hello(@RequestParam(name="who",defaultValue="zhang san")String name){
        return "hello world :"+name;
    }

    @RequestMapping("/hello2/{id}/{username}")
    public String hello(@PathVariable(name="id") int userId,@PathVariable(name="username") String username){
        return "id:"+userId +"\n username:"+username+p.toString();
    }

}