package MVC;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloController {
    @GetMapping("/wtf")
    public String sayHello(){
        return "wtf";
    }
}