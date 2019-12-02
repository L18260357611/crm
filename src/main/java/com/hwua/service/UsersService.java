package com.hwua.service;

import com.hwua.pojo.Users;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UsersService {
    public Users login(@Param("username") String username, @Param("password") String password)throws Exception;
    public int addUsers(Users users)throws Exception;
   //查看所有用户
    public List<Users> findall()throws Exception;
    //查找用户，通过uid
    public  Users findallByuid(String uid)throws Exception;
}
