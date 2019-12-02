package com.hwua.service;

import com.hwua.pojo.Product;

import java.util.List;

public interface ProductService {
    //查询产品
    public List<Product> findall()throws Exception;
    //添加产品
    public int addProduct(Product product)throws Exception;
    public Product findByid(String id)throws Exception;
    //删除产品
    public int delProduct(String id)throws Exception;
}
