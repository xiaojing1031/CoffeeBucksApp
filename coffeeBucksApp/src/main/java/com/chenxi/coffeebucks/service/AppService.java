package com.chenxi.coffeebucks.service;

import com.chenxi.coffeebucks.entity.Coffee;
import com.chenxi.coffeebucks.entity.Order;

import java.util.List;

public interface AppService {
    List<Coffee> getCoffeeList();
    List<Order> getOrders();


    void saveCoffee(Coffee coffee);

    Coffee getCoffeeId(Long coffeeId);

    void deleteCoffee(Long coffeeId);

    List<Coffee> searchCoffeeList(String coffeeName);
}
