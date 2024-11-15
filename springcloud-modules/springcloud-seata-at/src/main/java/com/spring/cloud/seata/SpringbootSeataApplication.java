package com.spring.cloud.seata;

import org.apache.seata.spring.annotation.datasource.EnableAutoDataSourceProxy;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableAutoDataSourceProxy
public class SpringbootSeataApplication {

  public static void main(String[] args) throws Exception {
    SpringApplication.run(SpringbootSeataApplication.class, args);
  }
}
