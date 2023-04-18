import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class demo {

    @GetMapping("/w")
    public String hello(){
        return "Spring Boot";
    }
}
