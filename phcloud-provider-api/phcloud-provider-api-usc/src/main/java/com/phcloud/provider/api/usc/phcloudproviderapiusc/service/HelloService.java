package com.phcloud.provider.api.usc.phcloudproviderapiusc.service;

import com.phcloud.provider.api.usc.phcloudproviderapiusc.service.hystric.HelloServiceHystric;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Service
@FeignClient(value = "SERVICE-HI",fallback = HelloServiceHystric.class)
public interface HelloService {
    @RequestMapping(value="/hi",method = RequestMethod.GET)
    String sayHi(@RequestParam(value="name") String name);
}
