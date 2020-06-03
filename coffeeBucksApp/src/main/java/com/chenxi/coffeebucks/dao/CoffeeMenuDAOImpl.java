package com.chenxi.coffeebucks.dao;

import com.chenxi.coffeebucks.entity.coffeeMenu.CoffeeMenu;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class CoffeeMenuDAOImpl implements CoffeeMenuDAO {
    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public List<CoffeeMenu> getCoffeeMenuList() {
        Session currentSession = sessionFactory.getCurrentSession();
        Query<CoffeeMenu> query = currentSession.createQuery("from CoffeeMenu order by id");

        List<CoffeeMenu> list = query.getResultList();
        return list;
    }

    @Override
    public void saveCoffeeMenu(CoffeeMenu coffeeMenu) {

    }

    @Override
    public void deleteCoffeeMenu(Long coffeeMenuId) {

    }
}
