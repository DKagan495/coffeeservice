package by.kagan.coffeeservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import java.net.http.HttpRequest;

@SpringBootApplication
public class CoffeeserviceApplication {
    static int x = 2;
    public static void main(String[] args) {
        SpringApplication.run(CoffeeserviceApplication.class, args);
    }


}
