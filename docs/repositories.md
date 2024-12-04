# Repositórios

Não necessariamente é o mapeamento da tabela, é utilizado um agregado

A relação é de 1:1 entre repositório e agregado e não entre repositório e entidade

_dica: implementar os repositórios por último_ 

---

A ideia é ter uma interface de repositório dentro do domínio, 
e a classe que implementar essa interface, no caso, o repositório 
da infraestrutura ter a implementação real.