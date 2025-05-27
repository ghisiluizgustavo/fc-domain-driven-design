package me.ghisiluizgustavo.fcdomaindrivendesign.domain.event.shared.product.handler;

import me.ghisiluizgustavo.fcdomaindrivendesign.domain.event.shared.EventHandlerInterface;
import me.ghisiluizgustavo.fcdomaindrivendesign.domain.event.shared.product.ProductCreated;

public class SendEmailWhenProductIsCreatedHandler implements EventHandlerInterface<ProductCreated> {

    @Override
    public void handle(ProductCreated event) {
        System.out.println("Sending email..");
    }
}
