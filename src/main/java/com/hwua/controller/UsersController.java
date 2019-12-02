package com.hwua.controller;

import com.hwua.pojo.Role;
import com.hwua.pojo.Users;
import com.hwua.service.impl.RoleServiceImpl;
import com.hwua.service.impl.UsersServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpSession;
import java.util.List;
import java.util.UUID;

@Controller
public class UsersController {
    @Autowired
    private UsersServiceImpl usersService;
    @Autowired
    private RoleServiceImpl roleService;

    //登陆
    @RequestMapping("/login")
    public ModelAndView login(String username, String password, HttpSession session) throws Exception {
        System.out.println("进入登陆方法！！！====================");
        ModelAndView view = new ModelAndView();
        Users login = usersService.login(username, password);
        if (login == null) {
            view.setViewName("login");
            return view;
        }
        session.setAttribute("user",login);
        view.setViewName("pages/main");
        view.addObject("users", login);
        return view;
    }
    //添加用户
    @RequestMapping("/user/save.do")
    public ModelAndView addUsers(Users users) throws Exception {
        ModelAndView modelAndView = new ModelAndView();
        String uuid =String.valueOf(UUID.randomUUID()) ;
        users.setId(uuid);
        int i = usersService.addUsers(users);
        if (i != 0) {
            modelAndView.setViewName("forward:/findall");
            return modelAndView;
        }
        modelAndView.setViewName("pages/user-add");
        return modelAndView;
    }
    //查找所有用户
    @RequestMapping("/findall")
    public ModelAndView queryall()throws Exception{
        ModelAndView modelAndView = new ModelAndView("pages/user-list");
        List<Users> findall = usersService.findall();
        modelAndView.addObject("users",findall);
        return modelAndView;
    }
    //查看用户详情
    @RequestMapping("/queryByuid/{uid}")
    public ModelAndView queryByuid(@PathVariable("uid") String uid)throws Exception{
        System.out.println("获取的uid::::======================"+uid);
        Users users = usersService.findallByuid(uid);
        List<Role> roles = roleService.listByuid(uid);
        ModelAndView modelAndView = new ModelAndView("pages/user-show");
        users.setRoles(roles);
        modelAndView.addObject("user",users);
        return modelAndView;
    }
}
