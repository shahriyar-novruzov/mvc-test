package developia.mvctest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @GetMapping("/test")
    public String test() {
        return "Works !!!";
    }

    @GetMapping("/welcome")
    public String welcome() {
        return "Welcome to Spring MVC !!!";
    }
}
