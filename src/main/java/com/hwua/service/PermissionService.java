package com.hwua.service;

import com.hwua.pojo.Permission;

import java.util.List;

public interface PermissionService {
    //根据roleid查找
    public List<Permission> queryByrid(String rid) throws Exception;

    //查找所有权限
    public List<Permission> findAll() throws Exception;

    //根据传入的prtmissionID查询指定的权限
    public Permission findPermissionByID(String id) throws Exception;

    public int addpermission(Permission permission) throws Exception;

    //删除权限
    public int delpermission(String id) throws Exception;

}
