package org.example.app02server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class App02ServerApplication {

  public static void main(String[] args) {
    SpringApplication.run(App02ServerApplication.class, args);
  }

}
