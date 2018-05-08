package com.phcloud.provider.api.usc.phcloudproviderapiusc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EnableFeignClients
@EnableHystrix
public class PhcloudProviderApiUscApplication {

    public static void main(String[] args) {
        SpringApplication.run(PhcloudProviderApiUscApplication.class, args);
    }
}
