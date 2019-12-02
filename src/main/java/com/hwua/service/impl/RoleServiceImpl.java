package com.hwua.service.impl;

import com.hwua.mapper.RoleMapper;
import com.hwua.pojo.Role;
import com.hwua.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class RoleServiceImpl implements RoleService {
    @Autowired
    private RoleMapper mapper;
    @Override
    public List<Role> queryall() throws Exception {
        return mapper.queryall();
    }

    @Override
    public Role queryById(String id) throws Exception {
       if (id!=null){
          return mapper.queryById(id);
       }
        return null;
    }

    @Override
    public int addrole(Role role) throws Exception {
        if (role!=null){
            return mapper.addrole(role);
        }
        return 0;
    }

    @Override
    public List<Role> listByuid(String uid) throws Exception {
        return mapper.findlistByuid(uid);
    }

    @Override
    public int delrole(String id) throws Exception {
        return mapper.delrole(id);
    }
}
