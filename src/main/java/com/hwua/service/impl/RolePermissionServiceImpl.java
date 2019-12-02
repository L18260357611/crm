package com.hwua.service.impl;

import com.hwua.mapper.RolePermissionMapper;
import com.hwua.service.RolePermissionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class RolePermissionServiceImpl implements RolePermissionService {
    @Autowired
    private RolePermissionMapper mapper;
    @Override
    public int addRolePermission(List<String> permissionId, String roleId) throws Exception {
       for (String id:permissionId){
           mapper.addRolePermission(id,roleId);
       }
        return 0;
    }

    @Override
    public int delRolePermission(String roleId) throws Exception {
        return mapper.delRolePermission(roleId);
    }
}
