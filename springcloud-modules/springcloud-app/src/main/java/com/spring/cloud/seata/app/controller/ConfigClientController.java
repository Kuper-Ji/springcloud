package com.spring.cloud.seata.app.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author alan
 * @date 2024/11/7
 */
@RestController
@RefreshScope
public class ConfigClientController {
  @Value("${config.info}")
  private String ConfigInfo;

  @GetMapping("/consumer/config/info")
  public String getConfigInfo() {
    return ConfigInfo;
  }
}
