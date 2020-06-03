package com.chenxi.coffeebucks.entity.coffeeMenu;

import javax.persistence.*;

@Entity
@Table(name = "coffee_menu")
public class CoffeeMenu {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "coffee_name")
    private String coffeeName;

    @Column(name = "regular_size_price")
    private int regularPrice;

    @Column(name = "venti_size_price")
    private int ventiPrice;

    public CoffeeMenu() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCoffeeName() {
        return coffeeName;
    }

    public void setCoffeeName(String coffeeName) {
        this.coffeeName = coffeeName;
    }

    public int getRegularPrice() {
        return regularPrice;
    }

    public void setRegularPrice(int regularPrice) {
        this.regularPrice = regularPrice;
    }

    public int getVentiPrice() {
        return ventiPrice;
    }

    public void setVentiPrice(int ventiPrice) {
        this.ventiPrice = ventiPrice;
    }

    @Override
    public String toString() {
        return "CoffeeMenu{" +
                "id=" + id +
                ", coffeeName='" + coffeeName + '\'' +
                ", regularPrice=" + regularPrice +
                ", ventiPrice=" + ventiPrice +
                '}';
    }
}
