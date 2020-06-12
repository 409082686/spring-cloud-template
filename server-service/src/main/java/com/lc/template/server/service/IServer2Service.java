package com.lc.template.server.service;

import com.lc.template.server2.api.IServer2Api;
import org.springframework.cloud.openfeign.FeignClient;

@FeignClient(value = "server2")
public interface IServer2Service extends IServer2Api {
}
