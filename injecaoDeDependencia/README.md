# Desafio: Componentes e Injeção de Dependência

## Objetivo

Criar um sistema em **Java com Spring Boot** para calcular o **valor total de um pedido**, considerando **desconto** e **frete**.

## Regras do Frete

| Valor Básico do Pedido                   | Frete     |
| ---------------------------------------- | --------- |
| Abaixo de R\$ 100,00                     | R\$ 20,00 |
| De R\$ 100,00 até R\$ 200,00 (exclusive) | R\$ 12,00 |
| R\$ 200,00 ou mais                       | Grátis    |

## Exemplo de Entrada e Saída

### Exemplo 1

**Entrada:**

```
Código: 1034
Valor básico: 150.00
Desconto: 20.0%
```

**Saída:**

```
Pedido código 1034
Valor total: R$ 132.00
```

### Exemplo 2

**Entrada:**

```
Código: 2282
Valor básico: 800.00
Desconto: 10.0%
```

**Saída:**

```
Pedido código 2282
Valor total: R$ 720.00
```

### Exemplo 3

**Entrada:**

```
Código: 1309
Valor básico: 95.90
Desconto: 0.0%
```

**Saída:**

```
Pedido código 1309
Valor total: R$ 115.90
```

## Especificações Técnicas

- O sistema deve ser desenvolvido em **Java com Spring Boot**.
- A saída deve ser exibida no **log do terminal**.
- Cada serviço deve ser registrado com a anotação `@Service`.

