package com.hwua.service;

import java.util.List;

public interface RolePermissionService {
    //给角色添加权限
    public int addRolePermission(List<String> permissionId, String roleId)throws Exception;
    //删除权限
    public  int delRolePermission(String roleId )throws Exception;
}
