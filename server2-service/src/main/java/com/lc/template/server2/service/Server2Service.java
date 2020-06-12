package com.lc.template.server2.service;

import com.lc.template.server2.api.IServer2Api;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class Server2Service implements IServer2Api {

    private static final Logger logger = LoggerFactory.getLogger(Server2Service.class);

    @Override
    public String service2Test(@PathVariable("arg1") String arg1, @PathVariable("arg2") String arg2) {
        logger.info("方法：service2Test，参数：arg1:{},arg2:{}", arg1, arg2);
        return "{'msg':'success'}";
    }
}
