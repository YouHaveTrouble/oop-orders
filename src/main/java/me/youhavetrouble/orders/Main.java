package me.youhavetrouble.orders;

import me.youhavetrouble.orders.item.Burger;
import me.youhavetrouble.orders.item.Drink;
import me.youhavetrouble.orders.item.Fries;
import me.youhavetrouble.orders.item.Pizza;
import me.youhavetrouble.orders.order.Order;

public class Main {


    void main() {
        Pizza ronPizza = new Pizza(26);
        Fries ronFries = new Fries(10);
        Drink ronDrink = new Drink(25);

        Order ronOrder = new Order(ronPizza, ronFries, ronDrink);

        Burger sallyBurger = new Burger(30);
        Burger sallyBurger2 = new Burger(30);
        Fries sallyFries = new Fries(15);
        Drink sallyDrink = new Drink(20);

        Order sallyOrder = new Order(sallyBurger, sallyBurger2, sallyFries, sallyDrink);

        ronOrder.printCategorizedReceipt();
        sallyOrder.printCategorizedReceipt();
    }

}
