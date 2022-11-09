package org.itsci.malaproject.controller;


import org.itsci.malaproject.model.Order;
import org.itsci.malaproject.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class BillController {

        @Autowired
        private OrderService orderservice;


    @RequestMapping("/bill/list")
    public String Checkbill(@ModelAttribute("order") Order order, Model model) {
        System.out.println(order.getTableOrder() + " || " + order.getTotal());
        String result = orderservice.saveProduct(order);
        return ("checkbill");
    }
}
