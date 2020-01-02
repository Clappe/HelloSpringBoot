package springboot_test.demo.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;


@RestController
public class HelloWorld {
   @GetMapping("/hello")
    public String hello(){
        return "Hello SpringBoot!";
    }
}
