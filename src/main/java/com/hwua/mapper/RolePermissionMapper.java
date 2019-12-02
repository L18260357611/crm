package com.hwua.mapper;

import org.springframework.stereotype.Component;

@Component
public interface RolePermissionMapper {
    //给角色添加权限
    public int addRolePermission(String permissionId,String roleId)throws Exception;
    //删除权限
    public  int delRolePermission(String roleId )throws Exception;
}
