package developia.mvctest.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/test")
public class TestController {

    @GetMapping("/test")
    public String test() {
        return "Works !!!";
    }

    @GetMapping("/create")
    public String welcome() {
        return "Welcome to Spring MVC !!!";
    }
}
