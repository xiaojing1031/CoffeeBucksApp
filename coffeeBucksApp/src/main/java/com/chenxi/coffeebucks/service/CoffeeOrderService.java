package com.chenxi.coffeebucks.service;

import com.chenxi.coffeebucks.entity.orderMangement.Coffee;
import com.chenxi.coffeebucks.entity.orderMangement.Order;

import java.util.List;

public interface CoffeeOrderService {
    List<Coffee> getCoffeeList();
    List<Order> getOrders();


    void saveCoffee(Coffee coffee);

    Coffee getCoffeeId(Long coffeeId);

    void deleteCoffee(Long coffeeId);

    List<Coffee> searchCoffeeList(String coffeeName);
}
