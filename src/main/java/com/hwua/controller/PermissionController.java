package com.hwua.controller;

import com.hwua.pojo.Permission;
import com.hwua.service.impl.PermissionServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;
import java.util.UUID;

@Controller
public class PermissionController {
    @Autowired
    private PermissionServiceImpl service;

    //查看所有权限
    @RequestMapping("/findallpermission")
    public ModelAndView queryall() throws Exception {
        ModelAndView modelAndView = new ModelAndView("pages/permission-list");
        List<Permission> permissions = service.findAll();
        modelAndView.addObject("permissions", permissions);
        return modelAndView;
    }

    //查看指定权限
    @RequestMapping("/findpermissionByid/{id}")
    public ModelAndView findpermissionByid(@PathVariable("id") String id) throws Exception {
        Permission permission = service.findPermissionByID(id);
        System.out.println("获取到的permission 的id" + permission);
        ModelAndView modelAndView = new ModelAndView("pages/permission-show");
        modelAndView.addObject("permission", permission);
        return modelAndView;
    }

    //添加权限
    @RequestMapping("/addpermission")
    public ModelAndView addpermission(Permission permission) throws Exception {
        String id = String.valueOf(UUID.randomUUID());
        permission.setId(id);
        service.addpermission(permission);
        ModelAndView modelAndView = new ModelAndView("redirect:/findallpermission");
        return modelAndView;
    }

    //删除权限
    @RequestMapping("delpermission/{id}")
    public ModelAndView delpermission(@PathVariable("id") String id) throws Exception {
        int delpermission = service.delpermission(id);
        ModelAndView modelAndView = new ModelAndView("redirect:/findallpermission");
        return modelAndView;
    }
    //给角色添加权限
    @RequestMapping("/role/findallpermission/{rid}")
    public ModelAndView rolequeryall(@PathVariable("rid") String rid) throws Exception {
        ModelAndView modelAndView = new ModelAndView("pages/role-permission-add");
        List<Permission> permissions = service.findAll();
        modelAndView.addObject("rid",rid);
        System.out.println("获取到的rid*****************************************************"+rid);
        modelAndView.addObject("permissionList", permissions);
        return modelAndView;
    }
}
