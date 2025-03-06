package com.spring.SpringData.web;

import com.spring.SpringData.dao.IPersonDAO;
import com.spring.SpringData.domain.Person;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
@Slf4j
public class StartController {

    @Autowired
    private IPersonDAO personDAO;

    @GetMapping("/")
    public String startPage(Model model) {
        var people = personDAO.findAll();
        model.addAttribute("people", people);
        return "index";
    }
}
