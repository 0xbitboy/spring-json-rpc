package com.github.liaojiacan.jsonrpc.provider.controller;

import com.github.liaojiacan.jsonrpc.api.service.UserService;
import com.github.liaojiacan.jsonrpc.provider.vo.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

/**
 * Created by liaojiacan on 2017/4/8.
 */
@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("/user")
    public Map<String,Object> query(String username){
        return Result.successWrapper("object",userService.getUserByUsername(username));
    }

}
