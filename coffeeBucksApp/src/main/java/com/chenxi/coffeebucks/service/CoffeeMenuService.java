package com.chenxi.coffeebucks.service;

import com.chenxi.coffeebucks.entity.coffeeMenu.CoffeeMenu;

import java.util.List;

public interface CoffeeMenuService {

    List<CoffeeMenu> getCoffeeMenuList();

    void saveCoffeeMenu(CoffeeMenu coffeeMenu);

    void deleteCoffeeMenu(Long coffeeMenuId);
}
