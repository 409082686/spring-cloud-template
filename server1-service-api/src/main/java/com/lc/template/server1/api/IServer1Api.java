package com.lc.template.server1.api;


import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@RequestMapping("server1")
public interface IServer1Api {

    @RequestMapping(value = "/service1Test/{arg1}/{arg2}", method = RequestMethod.GET)
    String service1Test(@PathVariable("arg1") String arg1, @PathVariable("arg2") String arg2);
}
