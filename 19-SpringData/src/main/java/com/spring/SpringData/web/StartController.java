package com.spring.SpringData.web;

import com.spring.SpringData.dao.IPersonDAO;
import com.spring.SpringData.domain.Person;
import com.spring.SpringData.services.PersonService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
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
    public String savePerson(Person person) {
        personService.savePerson(person);
        return "redirect:/";
    }

    @GetMapping("/edit/{idPerson}")
    public String editPerson(Person person, Model model) {
        var personToEdit = personService.findPerson(person);
        model.addAttribute("person", personToEdit);
        return "modify";
    }
}
