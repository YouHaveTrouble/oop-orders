package me.youhavetrouble.orders.item;

public abstract class OrderItem {

    public final Type type;
    public final int price;

    public OrderItem(Type type, int price) {
        this.type = type;
        this.price = price;
    }

    public enum Type {
        DRINK, BURGER, PIZZA, FRIES
    }

}

