package com.spring.SpringData;

import com.spring.SpringData.domain.Person;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Arrays;

@Controller
@Slf4j
public class StartController {

    @GetMapping("/")
    public String startPage(Model model) {
        var message = "Hello World with Thymeleaf";
        var person = new Person();
        person.setName("John");
        person.setLastName("Doe");
        person.setEmail("john.doe@example.com");
        person.setPhone("123-456-7890");

        var persona2 = new Person();
        persona2.setName("Jane");
        persona2.setLastName("Smith");
        persona2.setEmail("jane.smith@example.com");
        persona2.setPhone("987-654-3210");

        var people = Arrays.asList(person, persona2);

        model.addAttribute("people", people);
        log.info("Rendering start page");
        model.addAttribute("message", message);
        return "index";
    }
}
