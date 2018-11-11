package com.example.configserver;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableAutoConfiguration
@EnableConfigServer
public class ConfigServerApplication {

  public static void main(String[] args) {
//    SpringApplication.run(ConfigServerApplication.class, args);
    new SpringApplicationBuilder(ConfigServerApplication.class)
        .properties("spring.config.name=configserver").run(args);
  }
}
