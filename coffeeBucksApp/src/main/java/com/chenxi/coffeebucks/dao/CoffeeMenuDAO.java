package com.chenxi.coffeebucks.dao;

import com.chenxi.coffeebucks.entity.coffeeMenu.CoffeeMenu;
import com.chenxi.coffeebucks.entity.orderMangement.Coffee;

import java.util.List;

public interface CoffeeMenuDAO {
    List<CoffeeMenu> getCoffeeMenuList();

    void saveCoffeeMenu(CoffeeMenu coffeeMenu);

    void deleteCoffeeMenu(Long coffeeMenuId);
}
