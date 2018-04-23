package com.lee.feigncenter.core.service;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author jack
 * @since 2018/4/23
 */
@FeignClient("service-hi")
public interface HelloService {
    @RequestMapping(value = "/hi",method = RequestMethod.GET)
    String home(@RequestParam(value = "name") String name);
}
