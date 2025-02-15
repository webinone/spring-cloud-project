package org.example.app01server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class App01ServerApplication {

  public static void main(String[] args) {
    SpringApplication.run(App01ServerApplication.class, args);
  }

}
