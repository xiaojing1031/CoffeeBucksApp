package com.chenxi.coffeebucks.service;

import com.chenxi.coffeebucks.dao.CoffeeDAO;
import com.chenxi.coffeebucks.dao.OrderDAO;
import com.chenxi.coffeebucks.entity.Coffee;
import com.chenxi.coffeebucks.entity.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class AppServiceImpl implements AppService {
    @Autowired
    private CoffeeDAO coffeeDAO;

    @Autowired
    private OrderDAO orderDAO;

    @Transactional
    public List<Coffee> getCoffeeList() {
        return coffeeDAO.getCoffeeList();
    }

    @Transactional
    public List<Order> getOrders() {
        return orderDAO.getOrders();
    }

    @Override
    @Transactional
    public void saveCoffee(Coffee coffee) {

        coffeeDAO.saveCoffee(coffee);
    }

    @Override
    @Transactional
    public Coffee getCoffeeId(Long coffeeId) {

        return coffeeDAO.getCoffeeId(coffeeId);
    }

    @Override
    @Transactional
    public void deleteCoffee(Long coffeeId) {

        coffeeDAO.deleteCoffee(coffeeId);
    }

    @Override
    @Transactional
    public List<Coffee> searchCoffeeList(String coffeeName) {

        return coffeeDAO.searchCoffeeList(coffeeName);
    }
}
