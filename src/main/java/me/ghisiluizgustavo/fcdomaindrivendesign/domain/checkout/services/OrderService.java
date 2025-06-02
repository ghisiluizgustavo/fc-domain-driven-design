package me.ghisiluizgustavo.fcdomaindrivendesign.domain.checkout.services;

import me.ghisiluizgustavo.fcdomaindrivendesign.domain.customer.entity.Customer;
import me.ghisiluizgustavo.fcdomaindrivendesign.domain.checkout.entity.Order;
import me.ghisiluizgustavo.fcdomaindrivendesign.domain.checkout.entity.OrderItem;

import java.util.List;
import java.util.UUID;

public class OrderService {

    public static double total(List<Order> orders) {
        return orders.stream().reduce(0.0, (acc, order) -> acc + order.total(), Double::sum);
    }

    public static Order placeOrder(Customer customer, List<OrderItem> items) {
        if (items.isEmpty()) {
            throw new IllegalArgumentException("No items to place, order cannot be placed");
        }

        final Order order = new Order(UUID.randomUUID().toString(), customer.getId(), items);
        customer.addRewardPoints(order.total() / 2);

        return order;
    }
}
