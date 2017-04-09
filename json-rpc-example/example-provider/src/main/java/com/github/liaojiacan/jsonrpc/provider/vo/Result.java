package com.github.liaojiacan.jsonrpc.provider.vo;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by liaojiacan on 2017/4/8.
 */
public class Result {
    public static final Map<String, Object> SIMPLE_SUCCESS = new HashMap<String, Object>();
    public static final Map<String, Object> SIMPLIE_FAIL = new HashMap<String, Object>();

    static {
        SIMPLE_SUCCESS.put("code",200);
        SIMPLE_SUCCESS.put("info","success");

        SIMPLIE_FAIL.put("code", -200);
        SIMPLIE_FAIL.put("info", "fail");
    }

    public static Map<String, Object> successWrapper(String name,Map<String,Object> embed){
        Map resultMap = new HashMap();
        resultMap.put("code",200);
        resultMap.put("info","success");
        resultMap.put(name, embed);
        return resultMap;
    }

    public static Map<String, Object> successWrapper(String name,List<Object> embed){
        Map resultMap = new HashMap();
        resultMap.put("code",200);
        resultMap.put("info","success");
        resultMap.put(name, embed);
        return resultMap;
    }

    public static Map<String, Object> successWrapper(String name,Object embed){
        Map resultMap = new HashMap();
        resultMap.put("code",200);
        resultMap.put("info","success");
        resultMap.put(name, embed);
        return resultMap;
    }

}
