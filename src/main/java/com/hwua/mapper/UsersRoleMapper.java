package com.hwua.mapper;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

@Component
public interface UsersRoleMapper {
    //添加用户角色
    public int addUserRole(@Param("userId") String userId,@Param("roleId") String roleId)throws Exception;
    //根据用户id删除权限
    public int deladdUserRole(String uid)throws Exception;
}
