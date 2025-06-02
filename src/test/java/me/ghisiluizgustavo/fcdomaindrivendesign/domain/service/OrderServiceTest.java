package me.ghisiluizgustavo.fcdomaindrivendesign.domain.service;

import me.ghisiluizgustavo.fcdomaindrivendesign.domain.checkout.services.OrderService;
import me.ghisiluizgustavo.fcdomaindrivendesign.domain.customer.entity.Customer;
import me.ghisiluizgustavo.fcdomaindrivendesign.domain.checkout.entity.Order;
import me.ghisiluizgustavo.fcdomaindrivendesign.domain.checkout.entity.OrderItem;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

public class OrderServiceTest {

    @Test
    @DisplayName("Should get total of all orders")
    public void getAllOrders() {
        final OrderItem item1 = new OrderItem("01", "Item 1", 100.0, "p1", 1);
        final OrderItem item2 = new OrderItem("02", "Item 2", 200.0, "p2", 1);

        final Order order1 = new Order("01", "c1", List.of(item1));
        final Order order2 = new Order("02", "c1", List.of(item2));

        final double total = OrderService.total(List.of(order1, order2));

        Assertions.assertEquals(300.0, total);
    }

    @Test
    @DisplayName("Should place an order")
    public void placeOrder() {
        final Customer customer1 = new Customer("01", "John Doe");
        final OrderItem item1 = new OrderItem("01", "Item 1", 10.0, "p1", 1);
        final Order order1 = OrderService.placeOrder(customer1, List.of(item1));

        Assertions.assertEquals(5, customer1.getRewardPoints());
        Assertions.assertEquals(10, order1.total());
    }

}
