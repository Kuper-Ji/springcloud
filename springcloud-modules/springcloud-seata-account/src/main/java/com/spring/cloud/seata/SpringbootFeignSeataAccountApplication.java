package com.spring.cloud.seata;

/**
 * @author alan
 * @date 2024/11/11
 */
import org.apache.seata.spring.annotation.datasource.EnableAutoDataSourceProxy;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableAutoDataSourceProxy
public class SpringbootFeignSeataAccountApplication {

  public static void main(String[] args) {
    SpringApplication.run(SpringbootFeignSeataAccountApplication.class, args);
  }
}
