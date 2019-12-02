package com.hwua.mapper;

import com.hwua.pojo.Users;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface UsersMapper {
    public Users login(@Param("username") String username,@Param("password") String password)throws Exception;
    public int addUsers(Users users)throws Exception;
    //用户查询
    public List<Users> findall()throws Exception;
    //通过用户id查找
    public  Users findByuid(String uid)throws Exception;

}
