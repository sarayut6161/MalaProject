package org.itsci.malaproject.controller;

import org.itsci.malaproject.model.Beverage;
import org.itsci.malaproject.model.Mala;
import org.itsci.malaproject.model.Order;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.*;
@Controller
@RequestMapping("/mala")

public class MalaController {
    private String title = "หม่าล่า";
    private String title2 = "เบียร์";
    private List<Mala> items = null;

    private List<Mala> getMala() {
        if (items == null) {
            items = new ArrayList<>();
            items.add(new Mala("M0001","เบค่อนพัดเห็ด",10));
            items.add(new Mala("M0002","ไส้กรอกรมควันใหญ่",10));
            items.add(new Mala("M0003","ไส้กรอกรมควันเล็ก",5));
            items.add(new Mala("M0004","ไส้หมู",5));
            items.add(new Mala("M0005","ปูอัด",5));
            items.add(new Mala("M0006","เต้าหู้",5));
            items.add(new Mala("M0007","ลูกชิ้นปลา",5));
            items.add(new Mala("M0008","ไส้อั่ว",5));
            items.add(new Mala("M0009","หมึกกรอบ",10));
            items.add(new Mala("M00010","ปูอัดรูปกุ้ง",10));
            items.add(new Mala("M0011","กระเจี๊ยบ",5));
            items.add(new Mala("M0012","ไส้กรอกชีส",5));
            items.add(new Mala("M0013","เห็ดนางรม",5));
            items.add(new Mala("M0014","หมูสามชั้น",10));
            items.add(new Mala("M0015","เนื้อไก่",5));
            items.add(new Mala("M0016","ลูกชิ้นนมชมพู",5));
            items.add(new Mala("M0017","บล๊อคโครี่",5));
            items.add(new Mala("M0018","ลูกชิ้นเนื้อ",5));
            items.add(new Mala("M0019","ปลาดอลลี่",10));
            items.add(new Mala("M0020","ลูกชิ้นหมู",5));





        }
        return items;
    }
    private List<Beverage> bitems = null;

    private List<Beverage> getBeverage() {
        if (bitems == null) {
            bitems = new ArrayList<>();
            bitems.add(new Beverage("B0001","ช้าง",60));
            bitems.add(new Beverage("B0002","สิงห์",70));
            bitems.add(new Beverage("B0003","ลีโอ",65));
            bitems.add(new Beverage("B0004","MyBySingha",50));
            bitems.add(new Beverage("B0005","โซจู",89));

        }
        return bitems;
    }







    @GetMapping("/list")
    public String ListMala (Model model) {
        model.addAttribute("mala", getMala());
        model.addAttribute("beverage", getBeverage());
        model.addAttribute("title", title + " -รายการ");
        return "mala/list";
    }

    @GetMapping("/{malaID}/viewmala")
    public String view(@PathVariable("malaID") String malaID, Model model) {
        Mala mala = getMalByID(malaID);
        model.addAttribute("title", title + " รายละเอียด");
        model.addAttribute("mala", mala);
        return "mala/view";
    }


    private Mala getMalByID(String malaID) {
        for (Mala mala : items) {
            if (mala.getMalaID().equalsIgnoreCase(malaID)) {
                return mala;
            }
        }
        return null;
    }

    @GetMapping("/{malaID}/update-form")
    public String updateForm(@PathVariable("malaID") String malaID, Model model) {
        Mala mala = getMalByID(malaID);
        model.addAttribute("title", title + " รายละเอียด");
        model.addAttribute("mala", mala);
        return "mala/update";
    }

    @PostMapping("/{malaID}/update")
    public String update(@ModelAttribute("mala") Mala m) {
        Mala mala = getMalByID(m.getMalaID());
        mala.setMalaID(m.getMalaID());
        mala.setMalaname(m.getMalaname());
        return "redirect:view";
    }

















//    @PostMapping("/send")
//    public  String send (@RequestAttribute){
//        int desk = Parse.Integer(request.getAAtribute("desk"));
//        int total = Parse.Integer(request.getAAtribute("total"));
//
//        Order order = new Order();
//        order.setTable(desk);
//        order.setTotal(total);
//
//    }


/*

    @GetMapping("/{beverageID}/viewbev")
    public String viewbev(@PathVariable("beverageID") String beverageID, Model model) {
        Beverage beverage = getBeveragebyID(beverageID);
        model.addAttribute("title", title2 + " รายละเอียด");
        model.addAttribute("beverage", beverage);
        return "beverage/view";
    }
    private Beverage getBeveragebyID(String beverageID) {
        for (Beverage beverage : bitems) {
            if (beverage.getBeverageID().equalsIgnoreCase(beverageID)) {
                return beverage;
            }
        }
        return null;
    }

    @GetMapping("/{beverageID}/update-form2")
    public String updateForm2(@PathVariable("beverageID") String beverageID, Model model) {
        Beverage beverage = getBeveragebyID(beverageID);
        model.addAttribute("title", title + " รายละเอียด");
        model.addAttribute("beverage", beverage);
        return "beverage/update";
    }

    @PostMapping("/{beverageID}/update2")
    public String update2(@ModelAttribute("beverage") Beverage b) {
        Beverage beverage = getBeveragebyID(b.getBeverageID());
        beverage.setBeverageID(b.getBeverageID());
        beverage.setBeverageName(b.getBeverageName());
        return "redirect:view";
    }
*/





}


