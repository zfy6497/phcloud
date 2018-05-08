package com.phcloud.provider.api.usc.phcloudproviderapiusc.controller;


import com.phcloud.provider.api.usc.phcloudproviderapiusc.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/hello")
public class HelloController {
    @Autowired
    HelloService helloService;

    @RequestMapping(value = "/hi",method = RequestMethod.GET)
    public String SayHello(@RequestParam String name)
    {

        return  helloService.sayHi(name);
    }
}
