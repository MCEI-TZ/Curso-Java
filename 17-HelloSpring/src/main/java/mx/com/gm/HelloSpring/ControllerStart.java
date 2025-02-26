package mx.com.gm.HelloSpring;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class ControllerStart {

    @GetMapping("/")
    public String start(){
        log.info("Starting application...");
        return "Hello Spring Boot!";
    }
}
