package org.example.app02server.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/ms1")
public class MainController {

  @GetMapping("/hello")
  public String Hello() {
    return "ms2 - hello";
  }
}
