package com.hwua.service;

import com.hwua.pojo.Role;

import java.util.List;

public interface RoleService {
    //查询所有的权限
    public List<Role> queryall()throws Exception;
    //查找指定的权限
    public Role queryById(String id)throws Exception;
    //添加权限
    public int addrole(Role role)throws Exception;
    //根据用户id去查询对应的角色和id
    public List<Role> listByuid(String uid)throws Exception;
    //删除权限
    public int delrole(String id)throws Exception;
}
