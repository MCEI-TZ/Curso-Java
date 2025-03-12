package com.spring.SpringSecurityJPA.web;

import com.spring.SpringSecurityJPA.domain.Person;
import com.spring.SpringSecurityJPA.services.PersonService;
import jakarta.validation.Valid;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;


@Controller
@Slf4j
public class StartController {

    @Autowired
    private PersonService personService;

    @GetMapping("/")
    public String startPage(Model model) {
        var people = personService.listPeople();
        model.addAttribute("people", people);
        return "index";
    }

    @GetMapping("/add")
    public String addPerson(Person person) {
        return "modify";
    }

    @PostMapping("/save")
    public String savePerson(@Valid Person person, Errors errors) {
        if(errors.hasErrors()){
            return "modify";
        }
        personService.savePerson(person);
        return "redirect:/";
    }

    @GetMapping("/edit/{idPerson}")
    public String editPerson(Person person, Model model) {
        var personToEdit = personService.findPerson(person);
        model.addAttribute("person", personToEdit);
        return "modify";
    }

    @GetMapping("/delete/{idPerson}")
    public String deletePerson(Person person) {
        personService.deletePerson(person);
        return "redirect:/";
    }

    @GetMapping("/login")
    public String login(){
        return "login";
    }

    @GetMapping("/errors/403")
    public String error403(){
        return "errors/403";
    }
}
