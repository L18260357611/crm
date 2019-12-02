package com.hwua.service.impl;

import com.hwua.mapper.OrdersMapper;
import com.hwua.pojo.Orders;
import com.hwua.service.OrdersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class OrdersServiceImpl implements OrdersService {
    @Autowired
    private OrdersMapper mapper;
    @Override
    public List<Orders> findallOrders() throws Exception {
        return mapper.findallOrders();
    }
    @Override
    public Orders findOrdersByid(String id) throws Exception {
        return null;
    }
}
