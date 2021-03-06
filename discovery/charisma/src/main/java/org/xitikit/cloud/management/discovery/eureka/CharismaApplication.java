package org.xitikit.cloud.management.discovery.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@RefreshScope
@EnableEurekaServer
@SpringBootApplication
@EnableConfigurationProperties
public class CharismaApplication{

    public static void main(String[] args){

        SpringApplication.run(CharismaApplication.class, args);
    }
}