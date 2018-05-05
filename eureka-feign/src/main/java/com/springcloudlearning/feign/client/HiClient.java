package com.springcloudlearning.feign.client;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name = "eureka-client")
public interface HiClient {
    @RequestMapping(value = "/hi", method = RequestMethod.GET)
    String home(@RequestParam("name") String name);

}
