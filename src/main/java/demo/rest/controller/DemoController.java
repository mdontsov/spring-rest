package demo.rest.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class DemoController {

    // add code for /hello endpoint
    @GetMapping("hello")
    public String sayHello() {
        return "Hello World!";
    }
}
