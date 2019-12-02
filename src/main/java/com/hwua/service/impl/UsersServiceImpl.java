package com.hwua.service.impl;

import com.hwua.mapper.PermissionMapper;
import com.hwua.mapper.RoleMapper;
import com.hwua.mapper.UsersMapper;
import com.hwua.pojo.Users;
import com.hwua.service.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsersServiceImpl implements UsersService {
    @Autowired
    private UsersMapper mapper;
    @Autowired
    private RoleMapper roleMapper;
    @Autowired
    private PermissionMapper permissionMapper;

    @Override
    public Users login(String username, String password) throws Exception {
        return mapper.login(username, password);
    }

    @Override
    public int addUsers(Users users) throws Exception {
        return mapper.addUsers(users);

    }

    @Override
    public List<Users> findall() throws Exception {
        return mapper.findall();
    }

    @Override
    public Users findallByuid(String uid) throws Exception {
        Users users = mapper.findByuid(uid);
        return users;
    }

}
