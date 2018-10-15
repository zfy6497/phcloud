package com.phcloud.provider.api.usc.phcloudproviderapiusc.service.hystric;

import com.phcloud.provider.api.usc.phcloudproviderapiusc.service.HelloService;
import org.springframework.stereotype.Component;

@Component
public class HelloServiceHystric implements HelloService {

    @Override
    public String sayHi(String name) {
        return "this is hystric si hi:"+name;
    }
}
