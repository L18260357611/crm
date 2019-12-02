package com.hwua.mapper;

import com.hwua.pojo.Orders;
import org.springframework.stereotype.Component;

import java.util.List;
@Component
public interface OrdersMapper {
    public List<Orders> findallOrders()throws Exception;
    public Orders findOrdersByid(String id)throws Exception;
}
