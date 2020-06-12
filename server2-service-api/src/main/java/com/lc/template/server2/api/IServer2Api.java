package com.lc.template.server2.api;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@RequestMapping("server2")
public interface IServer2Api {

    @RequestMapping(value = "service2Test/{arg1}/{arg2}", method = RequestMethod.GET)
    String service2Test(@PathVariable("arg1") String arg1, @PathVariable("arg2") String arg2);
}
