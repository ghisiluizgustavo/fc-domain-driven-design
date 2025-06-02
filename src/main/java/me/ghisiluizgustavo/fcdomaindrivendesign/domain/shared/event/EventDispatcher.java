package me.ghisiluizgustavo.fcdomaindrivendesign.domain.shared.event;

import java.util.List;
import java.util.Map;

public class EventDispatcher implements EventDispatcherInterface {

    private final Map<String, List<EventHandlerInterface>> eventHandlerInterfaces;

    public EventDispatcher(Map<String, List<EventHandlerInterface>> eventHandlerInterfaces) {
        this.eventHandlerInterfaces = eventHandlerInterfaces;
    }

    public List<EventHandlerInterface> getEventHandler(String name) {
        return eventHandlerInterfaces.get(name);
    }

    @Override
    public void notify(EventInterface event) {
        final var eventName = event.getClass().getName();

        if (this.eventHandlerInterfaces.containsKey(eventName)){
            this.eventHandlerInterfaces.forEach((name, eventHandler) ->
                    eventHandler.forEach(handler -> handler.handle(event))
            );
        }
    }

    @Override
    public void register(String eventName, EventHandlerInterface eventHandler) {
        if (!this.eventHandlerInterfaces.containsKey(eventName)){
            this.eventHandlerInterfaces.put(eventName, null);
        }
        this.eventHandlerInterfaces.put(eventName, List.of(eventHandler));
    }

    @Override
    public void unregister(String eventName, EventHandlerInterface eventHandler) {
        this.eventHandlerInterfaces.remove(eventName);
    }

    @Override
    public void unregisterAll() {
        this.eventHandlerInterfaces.clear();
    }
}
