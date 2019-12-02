package com.hwua.service.impl;

import com.hwua.mapper.UsersRoleMapper;
import com.hwua.service.UsersRoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsersRoleServiceImpl implements UsersRoleService {
    @Autowired
    private UsersRoleMapper mapper;

    @Override
    public int addUserRole(String userId, List<String> Ids) throws Exception {
       for (String rid:Ids){
           mapper.addUserRole(userId,rid);
       }
        return 0;
    }
    @Override
    public int deladdUserRole(String uid) throws Exception {
        return mapper.deladdUserRole(uid);
    }
}
