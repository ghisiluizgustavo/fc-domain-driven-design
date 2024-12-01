# Domain Services

### Definição
É uma operação que não se enquadra dentro de um agregado, entidade ou objeto de valor,
ou quando precisasse de mais de um domínio ou agregado.

Domain Services são stateless, e muitas vezes os métodos são estáticos. (Similiares a utilitários)

### Questões
Uma entidade pode realizar uma ação que vai afetar todas as entidades?

Como calcular algo que está em outras em entidades?

### Cuidados
Quando houver muitos DomainServices os agregados pode estar anêmicos.

