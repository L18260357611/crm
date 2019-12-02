package com.hwua.service;

import com.hwua.pojo.Orders;

import java.util.List;

public interface OrdersService {
    public List<Orders> findallOrders()throws Exception;
    public Orders findOrdersByid(String id)throws Exception;
}
