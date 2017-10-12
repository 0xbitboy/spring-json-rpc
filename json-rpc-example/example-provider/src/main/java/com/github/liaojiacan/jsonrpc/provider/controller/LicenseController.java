package com.github.liaojiacan.jsonrpc.provider.controller;

import com.github.liaojiacan.jsonrpc.api.service.UserService;
import com.github.liaojiacan.jsonrpc.provider.vo.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by liaojiacan on 2017/4/8.
 */
@RestController
public class LicenseController {

    @RequestMapping("/*")
    public Map<String,Object> ahor(String username){
        Map<String,Object> res  = new HashMap<String,Object>();
        res.put("trailing",false);
        res.put("daysLeft",0);
        res.put("popup",true);
        res.put("activated",true);
        return res;
    }

}
