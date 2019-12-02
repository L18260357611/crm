package com.hwua.service.impl;

import com.hwua.mapper.PermissionMapper;
import com.hwua.pojo.Permission;
import com.hwua.service.PermissionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class PermissionServiceImpl implements PermissionService {
    @Autowired
    private PermissionMapper mapper;
    @Override
    public List<Permission> queryByrid(String rid) throws Exception {
        return mapper.queryByrid(rid);
    }

    @Override
    public List<Permission> findAll() throws Exception {
        return mapper.findAll();
    }

    @Override
    public Permission findPermissionByID(String id) throws Exception {
        return mapper.findPermissionByID(id);
    }

    @Override
    public int addpermission(Permission permission) throws Exception {
        return mapper.addpermission(permission);
    }

    @Override
    public int delpermission(String id) throws Exception {
        return mapper.delpermission(id);
    }
}
