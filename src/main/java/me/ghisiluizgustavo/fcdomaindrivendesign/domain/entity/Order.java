package me.ghisiluizgustavo.fcdomaindrivendesign.domain.entity;

import java.util.List;

public record Order(
        String id,
        String customerId,
        List<OrderItem> items
) {

    public Double total(){
        return items.stream().reduce(0.0, (acc, item) -> acc + item.price(), Double::sum);
    }
}
