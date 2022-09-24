package jsonbeautify.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = {"http://localhost:3000", "https://jsonbeautify.net"})
@RestController
@RequestMapping("/")
public class HomeController {

  @GetMapping("")
  public String homePage() {
    return "";
  }
}