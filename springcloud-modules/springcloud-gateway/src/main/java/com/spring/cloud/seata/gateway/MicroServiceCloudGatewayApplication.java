package com.spring.cloud.seata.gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @author alan
 * @date 2024/10/29
 */
@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
public class MicroServiceCloudGatewayApplication {
  public static void main(String[] args) {
    SpringApplication.run(MicroServiceCloudGatewayApplication.class, args);
  }
}
