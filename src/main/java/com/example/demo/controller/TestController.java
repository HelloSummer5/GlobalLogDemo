package com.example.demo.controller;

import com.example.demo.common.ResponseFactory;
import com.example.demo.common.Result;
import com.example.demo.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


/**
 * @ClassName TestController
 * @Description TODO
 * @Auth wujinjuan
 * @Date 2019/8/7 10:05
 * @Version 1.0
 **/
@Slf4j
@RestController
public class TestController {

    @Autowired
    private UserService userService;

    @GetMapping("list")
    public Result listUser(){
        return ResponseFactory.build(userService.listUser());
    }

}
