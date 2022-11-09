package org.itsci.malaproject.controller;


import org.itsci.malaproject.model.Login;
import org.itsci.malaproject.model.Order;
import org.itsci.malaproject.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/Login")
public class LoginController {
    @Autowired
    private OrderService orderservice;

    @RequestMapping("/loginDB")
    public String login (Login login){
        System.out.println(login.getUsername() + " || " + login.getPassword());
        boolean result = orderservice.loginUser(login);
        System.out.println("Login Pass " + result);
        if(result){

            return "LoginS";
        }else{

            return "loginf";
        }
    }



    @RequestMapping("/loginPage")
    public String loginPage (@ModelAttribute("login") Login login, Model model) {

        return "loginpage";
    }

}