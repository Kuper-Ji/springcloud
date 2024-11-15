package com.spring.cloud.seata.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author alan
 * @date 2024/10/29
 */
@SpringBootApplication
@EnableDiscoveryClient
public class MicroServiceCloudConsumerApplication {
  public static void main(String[] args) {
    SpringApplication.run(MicroServiceCloudConsumerApplication.class, args);
  }
}
