package com.spring.cloud.seata.app.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class ConsumerController {
  @Value("${server.port}")
  private String serverPort;

  @GetMapping(value = "/consumer/{id}")
  public String getPayment(@PathVariable("id") Integer id) {
    return "<h2>c语言中文网提醒您，服务访问成功！</h2>服务名：spring-cloud-alibaba-consumer<br /> 端口号： "
        + serverPort
        + "<br /> 传入的参数："
        + id;
  }
}
