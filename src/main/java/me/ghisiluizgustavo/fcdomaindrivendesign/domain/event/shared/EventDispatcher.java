package me.ghisiluizgustavo.fcdomaindrivendesign.domain.event.shared;

import java.util.Map;

public class EventDispatcher implements EventDispatcherInterface {

    private final Map<String, EventHandlerInterface> eventHandlerInterfaces;

    public EventDispatcher(Map<String, EventHandlerInterface> eventHandlerInterfaces) {
        this.eventHandlerInterfaces = eventHandlerInterfaces;
    }

    public EventHandlerInterface getEventHandler(String name) {
        return eventHandlerInterfaces.get(name);
    }

    @Override
    public void notify(EventInterface event) {

    }

    @Override
    public void register(String eventName, EventHandlerInterface eventHandler) {
        if (!this.eventHandlerInterfaces.containsKey(eventName)){
            this.eventHandlerInterfaces.put(eventName, null);
        }
        this.eventHandlerInterfaces.put(eventName, eventHandler);
    }

    @Override
    public void unregister(String eventName, EventHandlerInterface eventHandler) {

    }

    @Override
    public void unregisterAll() {

    }
}
