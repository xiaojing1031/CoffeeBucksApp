package com.chenxi.coffeebucks.dao;

import com.chenxi.coffeebucks.entity.Coffee;

import java.util.List;

public interface CoffeeDAO {
    List<Coffee> getCoffeeList();

    void saveCoffee(Coffee coffee);

    Coffee getCoffeeId(Long coffeeId);

    void deleteCoffee(Long coffeeId);

    List<Coffee> searchCoffeeList(String coffeeName);
}
