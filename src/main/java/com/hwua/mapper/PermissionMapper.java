package com.hwua.mapper;

import com.hwua.pojo.Permission;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface PermissionMapper {
    //根据roleid查找
    public List<Permission> queryByrid(String rid)throws Exception;
    //查找所有权限
    public List<Permission> findAll()throws Exception;
    //根据传入的prtmissionID查询指定的权限
    public Permission findPermissionByID(String id)throws Exception;
    //添加权限
    public int addpermission(Permission permission)throws Exception;
    //删除权限
    public int delpermission(String id)throws Exception;

}
