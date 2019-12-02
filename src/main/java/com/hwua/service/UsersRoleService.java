package com.hwua.service;

import java.util.List;

public interface UsersRoleService {
    //添加用户角色
    public int addUserRole(String userId,List<String> Ids)throws Exception;
    //根据用户id删除权限
    public int deladdUserRole(String uid)throws Exception;
}
