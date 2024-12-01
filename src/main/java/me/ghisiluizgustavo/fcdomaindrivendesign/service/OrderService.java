package me.ghisiluizgustavo.fcdomaindrivendesign.service;

import me.ghisiluizgustavo.fcdomaindrivendesign.entity.Order;

import java.util.List;

public class OrderService {

    public static double total(List<Order> orders) {
        return orders.stream().reduce(0.0, (acc, order) -> acc + order.total(), Double::sum);
    }
}
