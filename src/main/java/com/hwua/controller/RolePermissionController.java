package com.hwua.controller;

import com.hwua.service.impl.RolePermissionServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class RolePermissionController {
    @Autowired
    private RolePermissionServiceImpl service;
    //给角色添加权限
    @RequestMapping("/RolePermission/addRolePermission")
    public ModelAndView addRolePermission(@RequestParam(value = "ids")List<String> ids, String rid)throws Exception{
        service.delRolePermission(rid);
        service.addRolePermission(ids,rid);
        ModelAndView view = new ModelAndView("redirect: /rolequeryall");
        return view;
    }
}
