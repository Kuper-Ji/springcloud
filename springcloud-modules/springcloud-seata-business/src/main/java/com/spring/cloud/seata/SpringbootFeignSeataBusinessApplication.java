package com.spring.cloud.seata;
import org.apache.seata.spring.annotation.datasource.EnableAutoDataSourceProxy;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
@EnableAutoDataSourceProxy(dataSourceProxyMode = "XA")
public class SpringbootFeignSeataBusinessApplication  {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootFeignSeataBusinessApplication.class, args);
    }

}
