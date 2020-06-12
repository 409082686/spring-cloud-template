package com.lc.template.server1.service;

import com.lc.template.server1.api.IServer1Api;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Server1Service implements IServer1Api {
    private static final Logger logger = LoggerFactory.getLogger(Server1Service.class);

    @Override
    public String service1Test(@PathVariable("arg1") String arg1, @PathVariable("arg2") String arg2) {
        logger.info("方法：service1Test，参数：arg1:{},arg2:{}", arg1, arg2);
        return "{'msg':'success'}";
    }
}
