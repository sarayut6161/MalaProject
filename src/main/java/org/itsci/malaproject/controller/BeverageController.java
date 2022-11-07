package org.itsci.malaproject.controller;

import org.itsci.malaproject.model.Beverage;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.*;


@Controller
@RequestMapping("/beverage")
public class BeverageController {
    private String title = "เครื่องดื่ม";
    private List<Beverage> items = null;

    private List<Beverage> getBeverage() {
        if (items == null) {
            items = new ArrayList<>();
            items.add(new Beverage("B0001","ช้าง",60));
            items.add(new Beverage("B0002","สิงห์",70));
        }
        return items;
    }


    @GetMapping("/list")
    public String ListBevberage (Model model) {
        model.addAttribute("beverage", getBeverage());
        model.addAttribute("title", title + " -รายการ");
        return "beverage/list";
    }

    @GetMapping("/{beverageID}/view")
    public String view(@PathVariable("beverageID") String beverageID, Model model) {
        Beverage beverage = getBeveragebyID(beverageID);
        model.addAttribute("title", title + " รายละเอียด");
        model.addAttribute("beverage", beverage);
        return "beverage/view";
    }

    private Beverage getBeveragebyID(String beverageID) {
        for (Beverage beverage : items) {
            if (beverage.getBeverageID().equalsIgnoreCase(beverageID)) {
                return beverage;
            }
        }
        return null;
    }

    @GetMapping("/{beverageID}/update-form")
    public String updateForm(@PathVariable("beverageID") String beverageID, Model model) {
        Beverage beverage = getBeveragebyID(beverageID);
        model.addAttribute("title", title + " รายละเอียด");
        model.addAttribute("beverage", beverage);
        return "beverage/update";
    }

    @PostMapping("/{beverageID}/update")
    public String update(@ModelAttribute("beverage") Beverage b) {
        Beverage beverage = getBeveragebyID(b.getBeverageID());
        beverage.setBeverageID(b.getBeverageID());
        beverage.setBeverageName(b.getBeverageName());
        return "redirect:view";
    }

}



