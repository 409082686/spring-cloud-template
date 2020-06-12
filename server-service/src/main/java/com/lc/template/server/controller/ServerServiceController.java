package com.lc.template.server.controller;

import com.lc.template.server.service.IServer1Service;
import com.lc.template.server.service.IServer2Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/server0")
public class ServerServiceController {

    @Autowired
    private IServer1Service server1Service;

    @Autowired
    private IServer2Service server2Service;

    @RequestMapping(value = "/test", method = RequestMethod.GET)
    public String test(@RequestParam("arg1") String arg1, @RequestParam("arg2") String arg2) {
        server1Service.service1Test(arg1, arg2);
        server2Service.service2Test(arg1, arg2);
        return "success";

    }


}
