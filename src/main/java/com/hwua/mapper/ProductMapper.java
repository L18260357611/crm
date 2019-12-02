package com.hwua.mapper;

import com.hwua.pojo.Product;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface ProductMapper {
    //查询产品
    public List<Product> findall()throws Exception;
    //添加产品
    public int addProduct(Product product)throws Exception;
    //查找指定产品
    public Product findByid(String id)throws Exception;
    //删除产品
    public int delProduct(String id)throws Exception;
}
