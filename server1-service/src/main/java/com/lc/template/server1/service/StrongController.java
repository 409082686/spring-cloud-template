package com.lc.template.server1.service;

import com.alibaba.fastjson.JSONObject;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/strong")
@RestController
public class StrongController {


    @RequestMapping("/UploadDate")
    public String uploadDate(@RequestParam("Code") String code, @RequestParam("Body") String body) {
        System.out.println("-----code:" + code);
        System.out.println("-----body:" + body);
        JSONObject jsonObject = JSONObject.parseObject(body);
        Integer d_sync = (Integer) jsonObject.get("d_sync");
        return "{\"id\":\"0xF0\",\"d_sync\":" + d_sync + "}";
    }

    @PostMapping("/DownloadData")
    public String downloadData(@RequestParam("Code") String code, @RequestParam("Body") String body, @RequestParam(value = "isLogin", required = false) String isLogin) {
        System.out.println("-----code:" + code);
        System.out.println("-----body:" + body);
        System.out.println("-----isLogin:" + isLogin);
//        JSONObject jsonObject = JSONObject.parseObject(body);
//        Integer d_sync = (Integer) jsonObject.get("d_sync");
        //return "{\"id\":\"0xF0\",\"d_sync\":" + d_sync + "}";
        return "{\"id\":\"0xF0\",\"d_sync\": 0 }";
    }

}
