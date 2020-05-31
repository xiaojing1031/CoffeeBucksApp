package com.chenxi.coffeebucks.dao;

import com.chenxi.coffeebucks.entity.Coffee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.joda.money.CurrencyUnit;
import org.joda.money.Money;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.List;
import java.util.logging.Logger;

@Repository
public class CoffeeDAOImpl implements CoffeeDAO {
    // need to inject the session factory
    @Autowired
    private SessionFactory sessionFactory;

    public List<Coffee> getCoffeeList() {
        // get the current hibernate session
        Session currentSession = sessionFactory.getCurrentSession();

        Logger logger = Logger.getLogger(getClass().getName());

        // create a query

        Query<Coffee> theQuery
                = currentSession.createQuery("from Coffee order by id");

        //Long id = new Long(1);
        //Money price = Money.of(CurrencyUnit.of("CNY"), 200);

        // execute query and get result list
        List<Coffee> coffeeList = theQuery.getResultList();

        for (Coffee coffee : coffeeList) {
            logger.info("coffee price: " + coffee.getPrice());
        }
        //coffeeList.add(new Coffee(id, new Date(), new Date(), "Latte", price));

        // return the results
        return coffeeList;
    }

    @Override
    public void saveCoffee(Coffee coffee) {


        // get current hibernate session
        Session currentSession = sessionFactory.getCurrentSession();

        // save coffee ... to database (in hibernate: insert new record: use save() )
        // update existing record: update(...)
        currentSession.saveOrUpdate(coffee);

    }

    @Override
    public Coffee getCoffeeId(Long coffeeId) {

        // get the current hibernate session
        Session currentSession = sessionFactory.getCurrentSession();

        // now retrieve/read from database using the primary key
        Coffee theCoffee = currentSession.get(Coffee.class, coffeeId);
        return theCoffee;
    }

    @Override
    public void deleteCoffee(Long coffeeId) {

        Session currentSession = sessionFactory.getCurrentSession();


        // delete object with primary key
        Query theQuery =
                currentSession.createQuery("delete from Coffee where id='" + coffeeId + "'");

        theQuery.executeUpdate();

        // delete object with primary key
        //Query theQuery =
        //        currentSession.createQuery("delete from Coffee where id=:theId");
        //theQuery.setParameter("theId", coffeeId);
        //theQuery.executeUpdate();

        // delete object with primary key
        //Coffee theCoffee = currentSession.get(Coffee.class, coffeeId);
        //currentSession.delete(theCoffee);



    }

    @Override
    public List<Coffee> searchCoffeeList(String coffeeName) {

        Session currentSession = sessionFactory.getCurrentSession();
        Query theQuery = currentSession.createQuery("from Coffee");

        coffeeName.toLowerCase();

        if (coffeeName != null && coffeeName.trim().length() > 0) {

            theQuery = currentSession.createQuery("from Coffee where lower (coffee) like :theName");
            theQuery.setParameter("theName", "%" + coffeeName + "%");
        }
        // execute query and get result list
        List<Coffee> coffees = theQuery.getResultList();

        return coffees;
    }
}
