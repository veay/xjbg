package com.lee.usermodule.core;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author jack
 * @since 2018/4/23
 */
@RestController
@RequestMapping("/")
public class HelloController {

    @Value("${server.port}")
    String port;
    @RequestMapping("/hi")
    public String home(@RequestParam(defaultValue = "someone") String name) {
        return "hi "+name+",i am from port:" +port;
    }
}
