package com.hwua;

import com.hwua.controller.MemberController;
import com.hwua.controller.UsersController;
import com.hwua.pojo.Role;
import com.hwua.pojo.Users;
import com.hwua.service.impl.RoleServiceImpl;
import com.hwua.service.impl.UsersServiceImpl;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@SpringBootTest
class CrmApplicationTests {
    @Autowired
    private MemberController controller;
    @Autowired
    private UsersController usersController;
    @Autowired
    private UsersServiceImpl usersService;
    @Autowired
    private RoleServiceImpl roleService;

    @Test
    void contextLoads() throws Exception {

        List<Users> findall = usersService.findall();
        System.out.println(findall);
    }
    @Test
    void test2()throws Exception{
        List<Role> roles = roleService.listByuid("c032874a-a12a-11e9-b4b3-74d02bd4fd82");
        System.out.println(roles);
    }
    @Test
    void test3()throws Exception{
        ModelAndView modelAndView = usersController.queryByuid("a151fe9f-9f1e-11e9-a715-74d02bd4fd82");
    }
}
