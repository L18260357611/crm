package com.hwua;

import com.hwua.pojo.Permission;
import com.hwua.service.impl.Test1Impl;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
public class test1 {
    @Autowired
    private Test1Impl test1;
    @Test
    void test2()throws Exception{
        List<Permission> all = test1.all("3253d51f-9e49-11e9-8bcf-74d02bd4fd82");
        System.out.println(all);
    }
}
