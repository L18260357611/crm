package com.hwua.service.impl;

import com.hwua.mapper.PermissionMapper;
import com.hwua.pojo.Permission;
import com.hwua.service.Test1;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class Test1Impl implements Test1 {
    @Autowired
    private PermissionMapper mapper;
    @Override
    public List<Permission> all(String rid) throws Exception {
        return mapper.queryByrid(rid);
    }
}
