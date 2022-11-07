package org.itsci.malaproject.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/type")
public class TypeController {
    @RequestMapping("/type")
    public String login (){
        return "type";
    }
}
