package com.spring.cloud.seata;

import org.apache.seata.spring.annotation.datasource.EnableAutoDataSourceProxy;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableAutoDataSourceProxy
public class SpringbootFeignSeataStorageApplication {

  public static void main(String[] args) {
    SpringApplication.run(SpringbootFeignSeataStorageApplication.class, args);
  }
}
