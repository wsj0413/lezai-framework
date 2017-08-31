package com.lezai17.web.controller;

import com.lezai17.model.PersonForm;
import com.lezai17.model.test.User;
import com.lezai17.web.service.AbcService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import javax.validation.Valid;


@Controller
public class WebController {

    @Autowired
    private AbcService abcService;

    @GetMapping("/form")
    public String showForm(PersonForm personForm) {
        abcService.echoService.echo("abc");
        User user = new User();
        user.setPassword("123456");
        user.setUsername("张三");
        System.out.println(abcService.echoService.insertUser(user));
        return "form";
    }

    @PostMapping("/form")
    public String checkPersonInfo(@Valid PersonForm personForm, BindingResult bindingResult) {

        if (bindingResult.hasErrors()) {
            return "form";
        }

        return "redirect:/uploadForm";
    }
}
