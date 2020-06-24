package com.lc.template.server1.service;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.Enumeration;

@RequestMapping("/strong")
@RestController
public class StrongController {


    @RequestMapping("/accept")
    public String accept(HttpServletRequest request) {
        Enumeration<?> enum1 = request.getHeaderNames();
        while (enum1.hasMoreElements()) {
            String key = (String) enum1.nextElement();
            String value = request.getHeader(key);
            System.out.println(key + ": \t" + value);
        }
        return "success";
    }
}
