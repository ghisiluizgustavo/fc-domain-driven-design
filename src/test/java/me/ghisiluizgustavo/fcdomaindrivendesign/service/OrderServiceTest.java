package me.ghisiluizgustavo.fcdomaindrivendesign.service;

import me.ghisiluizgustavo.fcdomaindrivendesign.entity.Order;
import me.ghisiluizgustavo.fcdomaindrivendesign.entity.OrderItem;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

public class OrderServiceTest {

    @Test
    @DisplayName("Should get total of all orders")
    public void test() {
        final OrderItem item1 = new OrderItem("01", "Item 1", 100.0, "p1");
        final OrderItem item2 = new OrderItem("02", "Item 2", 200.0, "p2");

        final Order order1 = new Order("01", "c1", List.of(item1));
        final Order order2 = new Order("02", "c1", List.of(item2));

        final double total = OrderService.total(List.of(order1, order2));

        Assertions.assertEquals(total, 300.0);
    }

}
