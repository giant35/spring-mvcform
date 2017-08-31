/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.enjoylearn.demo.spring.mvcform;

import java.util.Objects;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author sihai
 */
@Controller
@RequestMapping("login")
public class LoginController {
    
    private static final Logger LOG = Logger.getLogger(LoginController.class.getName());
    
    @GetMapping
    public String input(ModelMap m) {
        m.addAttribute("user", new User());
        return "login";
    }
//    
//    User user;
//
//    public User getUser() {
//        return user;
//    }
//
//    public void setUser(User user) {
//        this.user = user;
//    }
//    
    
    @PostMapping
    public String login(@ModelAttribute User user, ModelMap model) {
        LOG.log(Level.INFO, "login enter..{0}", user.toString());
        final String ret;
        if (Objects.equals("demo", user.name) && Objects.equals("demo", user.pwd)) {
            ret = "info";
        } else {
            model.addAttribute("msg", "密码不正确");
            ret = "login";
        }
        return ret;
    }
}
