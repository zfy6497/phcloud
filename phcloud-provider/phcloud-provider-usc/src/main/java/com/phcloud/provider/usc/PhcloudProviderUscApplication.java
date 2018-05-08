package com.phcloud.provider.usc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
@EnableEurekaClient
public class PhcloudProviderUscApplication {

    public static void main(String[] args) {
        SpringApplication.run(PhcloudProviderUscApplication.class, args);
    }

    @RequestMapping("/hi")
    public  String SayHi(String name){
        return  "h1 8881:"+name;
    }
}
