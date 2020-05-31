package com.chenxi.coffeebucks.controller;

import com.chenxi.coffeebucks.entity.Coffee;
import com.chenxi.coffeebucks.entity.Order;
import com.chenxi.coffeebucks.service.AppService;
import org.dom4j.rule.Mode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
//@RequestMapping("/employee")
public class AppController {

    // need to inject the app service
    @Autowired
    private AppService appService;

    @GetMapping("/")
    public String showLanding() {

        return "landing";
    }


    // coffee form
    @GetMapping("/coffee")
    public String coffee(Model model) {

        // get coffee from service
        List<Coffee> coffeeList = appService.getCoffeeList();

        // add the coffee to the model
        model.addAttribute("coffee", coffeeList);

        return "coffee-list";
    }

    @GetMapping("/showCoffeeFormForAdd")
    public String showCoffeeFormForAdd(Model model) {
        // create model attribute to bind form data
        Coffee coffee = new Coffee();
        model.addAttribute("coffee", coffee);
        return "coffee-form";
    }

    @PostMapping("/saveCoffee")
    public String saveCoffee(@ModelAttribute("coffee") Coffee coffee) {
        // save coffee using our service
        appService.saveCoffee(coffee);
        return "redirect:/coffee";
    }

    @GetMapping("/showCoffeeFormForUpdate")
    public String showCoffeeFormForUpdate(@RequestParam("coffeeId") Long coffeeId,
                                          Model model) {
        // get coffee from the service
        Coffee theCoffee = appService.getCoffeeId(coffeeId);

        // set coffee as a model attribute to pre-populate the form
        model.addAttribute("coffee", theCoffee);

        // send over to our form
        return "coffee-form";
    }

    @GetMapping("/coffeeDelete")
    public String coffeeDelete(@RequestParam("coffeeId") Long coffeeId) {
        // delete the coffee
        appService.deleteCoffee(coffeeId);

        // send over to our form
        return "redirect:/coffee";
    }

    @GetMapping("/search")
    public String searchCoffee(@RequestParam("theSearchName") String coffeeName, Model model) {
        // search coffee from the service
        List<Coffee> coffees = appService.searchCoffeeList(coffeeName);

        // add the coffee to the model
        model.addAttribute("coffee", coffees);
        return "coffee-list";
    }

    // order form
    @GetMapping("/order")
    public String order(Model model) {

        // get order from service
        List<Order> orders = appService.getOrders();

        // add the customers to the model
        model.addAttribute("order", orders);

        return "order-list";
    }


}
