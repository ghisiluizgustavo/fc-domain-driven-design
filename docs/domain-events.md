# Domain Events

### O que é?

Capturar quando algo ocorrer (mudar) no evento de domínio.

Para cada event haverá uma lista de evetHandlers. Exemplo: 
event=ProductCreated eventHandlers=[SendEmailWhenProductIsCreatedHandler, SendToKafkaWhenProductIsCreatedHandler]


