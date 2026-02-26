package me.youhavetrouble.orders.order;

import me.youhavetrouble.orders.item.OrderItem;

import java.util.Collection;
import java.util.List;

public class Order {

    private final Collection<OrderItem> items;

    public Order(OrderItem... items) {
        this.items = List.of(items);
    }

    /**
     * Get the total price by order item category. If type is null, get the total price of all items.
     * @param type The type of order item to calculate the price for. If null, calculate the price for all items.
     * @return The total price of the specified type of order items, or all items if type is null.
     */
    public int getPrice(OrderItem.Type type) {
        int price = 0;
        for (OrderItem item : items) {
            if (type == null || item.type == type) {
                price += item.price;
            }
        }
        return price;
    }

    /**
     * Get the total price of all items in the order.
     * @return The total price of all items in the order.
     */
    public int getPrice() {
        return getPrice(null);
    }

    public void printCategorizedReceipt() {
        System.out.println("------- Receipt -------");
        for (OrderItem.Type type : OrderItem.Type.values()) {
            int price = getPrice(type);
            if (price <= 0) continue;
            System.out.println(type.name() + ": " + price);
        }
        System.out.println("Total: " + getPrice());
    }

}
