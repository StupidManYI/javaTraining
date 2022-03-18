package com.example.mybatis.controller;

import com.example.mybatis.dto.Params;
import com.example.mybatis.service.StoreTenantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author 小易
 */


@RestController
public class TestController {

    @Autowired
    private StoreTenantService storeTenantService;


    @GetMapping("/getById")
    public Object getById(@RequestBody Params params) {
        return storeTenantService.getOne(params.getId());
    }

    @GetMapping("/getByName")
    public Object getByName(@RequestBody Params params) {
        return storeTenantService.getOne(params.getName());
    }

}