package me.ghisiluizgustavo.fcdomaindrivendesign.domain.product.event.handler;

import me.ghisiluizgustavo.fcdomaindrivendesign.domain.shared.event.EventHandlerInterface;
import me.ghisiluizgustavo.fcdomaindrivendesign.domain.product.event.ProductCreated;

public class SendEmailWhenProductIsCreatedHandler implements EventHandlerInterface<ProductCreated> {

    @Override
    public void handle(ProductCreated event) {
        System.out.println("Sending email..");
    }
}
