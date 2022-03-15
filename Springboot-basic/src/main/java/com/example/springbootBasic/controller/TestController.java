package com.example.springbootBasic.controller;

import io.swagger.annotations.Api;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author 小易
 */


@Api(tags = "Test-测试")
@RestController
public class TestController {


    @GetMapping("/test")
    public String test() {
        return "hello";
    }

}