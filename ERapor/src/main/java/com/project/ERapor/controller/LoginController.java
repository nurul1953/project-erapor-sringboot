package com.project.ERapor.controller;

import com.project.ERapor.dto.GuruDto;
import com.project.ERapor.model.Guru;
import com.project.ERapor.repositories.GuruRepository;
import com.project.ERapor.service.EmailService;
import com.project.ERapor.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;
import java.util.Objects;

@Controller
public class LoginController {
    @Autowired
    LoginService loginService;
    @Autowired
    EmailService emailService;

    @RequestMapping("/login")
    public ModelAndView login() throws Exception{
        ModelAndView mav = new ModelAndView("login");
        mav.addObject("guru", new Guru());
        return mav;
    }

    @PostMapping("/cekLogin")
    public String login(@ModelAttribute("guru") Guru guru){
        Guru authGuru = loginService.login(guru.getUsername(), guru.getPassword());
        System.out.println(authGuru);
        if(Objects.nonNull(authGuru)){
            emailService.sendEmail();
            return "redirect:/dashboard";
        }
        else
            return "redirect:/login";
    }

}
