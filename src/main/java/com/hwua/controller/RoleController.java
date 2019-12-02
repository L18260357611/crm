package com.hwua.controller;

import com.hwua.pojo.Role;
import com.hwua.service.impl.RoleServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;
import java.util.UUID;

@Controller
public class RoleController {
    @Autowired

    private RoleServiceImpl service;
    //查找所有角色
    @RequestMapping("/rolequeryall")
    public ModelAndView findallRole() throws Exception {
        ModelAndView view = new ModelAndView("pages/role-list");
        List<Role> roles = service.queryall();
        view.addObject("roles", roles);
        return view;
    }
    //添加角色
    @RequestMapping("/addrole")
    public ModelAndView addRole(Role role) throws Exception {
        String id = String.valueOf(UUID.randomUUID());
        role.setId(id);
        ModelAndView view = new ModelAndView();
        int addrole = service.addrole(role);
        if (addrole != 0) {
            view.setViewName("redirect: /rolequeryall");
            return view;
        }
        view.setViewName("pages/role-add");
        return view;
    }
    //根据用户id添加权限
    @RequestMapping("/user-role-add/{uid}")
    public ModelAndView user_add_role(@PathVariable("uid") String uid) throws Exception {
        ModelAndView modelAndView = new ModelAndView("pages/user-role-add");
        List<Role> roles = service.queryall();
        modelAndView.addObject("role", roles);
        modelAndView.addObject("uid",uid);
        return modelAndView;
    }
    //删除角色
    @RequestMapping("/del-role-Id/{id}")
    public ModelAndView delroleByid(@PathVariable("id") String id) throws Exception {
        service.delrole(id);
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("redirect: /rolequeryall");
        return modelAndView;
    }
    //查看角色权限
    @RequestMapping("/queryByID/{id}")
    public ModelAndView queryByID(@PathVariable("id") String id) throws Exception {
        System.out.println("角色获取权限获取的id==============================="+id);
        Role role = service.queryById(id);
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("pages/role-show");
        modelAndView.addObject("role",role);
        return modelAndView;
    }
}
