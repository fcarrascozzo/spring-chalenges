## Desafio: CRUD de Clientes

### Objetivo
Criar um projeto **Spring Boot** contendo um **CRUD completo** de web services REST para acessar um recurso de clientes, com as seguintes operações:

- **Busca paginada de recursos**
- **Busca de recurso por ID**
- **Inserção de novo recurso**
- **Atualização de recurso**
- **Deleção de recurso**

### Requisitos do Projeto
- **Banco de dados H2** para testes
- **Maven** como gerenciador de dependências
- **Java** como linguagem

### Entidade `Client`
Cada cliente deve possuir:
- `name`: Nome
- `cpf`: CPF
- `income`: Renda
- `birthDate`: Data de nascimento
- `children`: Quantidade de filhos

📌 **O projeto deve ter um seed com pelo menos 10 clientes usando dados SIGNIFICATIVOS** (não usar nomes genéricos como "Nome 1", "Nome 2", etc.).

### Tratamento de Exceções
- **ID não encontrado** (para GET por ID, PUT e DELETE) → **Código 404**
- **Erro de validação** → **Código 422** com mensagens customizadas para cada campo inválido

🔹 **Regras de validação**:
- `name` **não pode ser vazio**
- `birthDate` **não pode ser uma data futura** (`@PastOrPresent`)