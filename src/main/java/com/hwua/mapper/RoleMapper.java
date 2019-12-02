package com.hwua.mapper;

import com.hwua.pojo.Role;
import org.springframework.stereotype.Component;

import java.util.List;
@Component
public interface RoleMapper {
    //查找所有
    public List<Role> queryall()throws Exception;
    //根据id查找
    public Role queryById(String id)throws Exception;
    //添加权限
    public int addrole(Role role)throws Exception;
    //删除权限
    public int delrole(String id)throws Exception;
    //根据用户id查找对应的角色
    public List<Role> findlistByuid(String uid)throws Exception;
}
