package com.chenxi.coffeebucks.controller;

import com.chenxi.coffeebucks.entity.coffeeMenu.CoffeeMenu;
import com.chenxi.coffeebucks.service.CoffeeMenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class LandingCoffeeMenuController {

    @Autowired
    private CoffeeMenuService coffeeMenuService;

    @GetMapping("/")
    public String showLanding(Model model) {

        List<CoffeeMenu> coffeeMenuList = coffeeMenuService.getCoffeeMenuList();
        model.addAttribute("products", coffeeMenuList);

        return "landing";
    }

}
