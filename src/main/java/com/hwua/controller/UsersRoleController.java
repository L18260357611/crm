package com.hwua.controller;

import com.hwua.service.impl.UsersRoleServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class UsersRoleController {
    @Autowired
    private UsersRoleServiceImpl service;
    //给用户添加角色
    @RequestMapping("/usersrole/addUserRole")
    public ModelAndView addUserRole(String userId, @RequestParam(value = "ids") List<String> ids)throws Exception{
        service.deladdUserRole(userId);
        service.addUserRole(userId,ids);
        ModelAndView view = new ModelAndView("redirect:/findall");
        return view;
    }
}
