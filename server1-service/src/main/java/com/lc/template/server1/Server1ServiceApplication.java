package com.lc.template.server1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class Server1ServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(Server1ServiceApplication.class, args);
    }

}
