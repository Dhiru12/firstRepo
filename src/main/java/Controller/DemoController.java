package Controller;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController
{
    @GetMapping("/home")
    public String ShowData()
    {
        return "Hello This Is Spring Boot Demo Project";
    }
}
