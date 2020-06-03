package com.chenxi.coffeebucks.dao;

import com.chenxi.coffeebucks.entity.orderMangement.Order;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class OrderDAOImpl implements OrderDAO{
    // need to inject the session factory
    @Autowired
    private SessionFactory sessionFactory;


    public List<Order> getOrders() {
        // get the current hibernate session
        Session currentSession = sessionFactory.getCurrentSession();

        // create a query

        Query<Order> theQuery
                = currentSession.createQuery("from Order order by id", Order.class);

        // execute query and get result list
        List<Order> orders = theQuery.getResultList();

        // return the results
        return orders;
    }
}
