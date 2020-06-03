package com.chenxi.coffeebucks.dao;

import com.chenxi.coffeebucks.entity.orderMangement.Order;

import java.util.List;

public interface OrderDAO {
    public List<Order> getOrders();

}
