package com.lc.template.server.service;

import com.lc.template.server1.api.IServer1Api;
import org.springframework.cloud.openfeign.FeignClient;

@FeignClient(value = "server1")
public interface IServer1Service extends IServer1Api {

}
