package com.hwua.controller;

import com.hwua.pojo.Orders;
import com.hwua.service.impl.OrdersServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class OrdersController {
    @Autowired
    private OrdersServiceImpl service;
    @RequestMapping("/findallOrders")
    public ModelAndView findallOrders()throws Exception{
        ModelAndView view = new ModelAndView("/pages/orders-list");
        List<Orders> orders = service.findallOrders();
        view.addObject("ordersList",orders);
        return view;
    }
}
