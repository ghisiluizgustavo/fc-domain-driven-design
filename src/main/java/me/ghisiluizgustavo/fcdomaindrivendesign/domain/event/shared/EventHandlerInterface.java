package me.ghisiluizgustavo.fcdomaindrivendesign.domain.event.shared;

public interface EventHandlerInterface<T extends EventInterface> {

    void handle(T event);

}
