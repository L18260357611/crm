package com.hwua.service.impl;

import com.hwua.mapper.ProductMapper;
import com.hwua.pojo.Product;
import com.hwua.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {
    @Autowired
    private ProductMapper mapper;

    @Override
    public List<Product> findall() throws Exception {
        return mapper.findall();
    }

    @Override
    public int addProduct(Product product) throws Exception {
        return mapper.addProduct(product);
    }

    @Override
    public Product findByid(String id) throws Exception {
        return mapper.findByid(id);
    }

    @Override
    public int delProduct(String id) throws Exception {
        return mapper.delProduct(id);
    }
}
