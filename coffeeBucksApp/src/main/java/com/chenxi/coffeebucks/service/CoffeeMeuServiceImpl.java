package com.chenxi.coffeebucks.service;

import com.chenxi.coffeebucks.dao.CoffeeMenuDAO;
import com.chenxi.coffeebucks.entity.coffeeMenu.CoffeeMenu;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class CoffeeMeuServiceImpl implements CoffeeMenuService {
    @Autowired
    private CoffeeMenuDAO coffeeMenuDAO;

    @Override
    @Transactional
    public List<CoffeeMenu> getCoffeeMenuList() {

        return coffeeMenuDAO.getCoffeeMenuList();
    }

    @Override
    @Transactional
    public void saveCoffeeMenu(CoffeeMenu coffeeMenu) {
        coffeeMenuDAO.saveCoffeeMenu(coffeeMenu);
    }

    @Override
    @Transactional
    public void deleteCoffeeMenu(Long coffeeMenuId) {
        coffeeMenuDAO.deleteCoffeeMenu(coffeeMenuId);
    }
}
