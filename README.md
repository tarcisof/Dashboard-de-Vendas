# Dashboard de Vendas
Um sistema de gerenciamento de vendas desenvolvido com Java, Spring Boot, PostgreSQL e JasperReports. Oferece cadastro de produtos, clientes e pedidos, além de um dashboard com estatísticas de vendas e geração de relatórios em PDF/Excel.

🚀 Funcionalidades
Cadastro de Produtos, Clientes e Pedidos

Dashboard com Estatísticas de Vendas

Relatórios Dinâmicos em PDF/Excel

Otimização com Cache

🛠️ Tecnologias
Backend: Java, Spring Boot, Spring Data JPA

Banco de Dados: PostgreSQL

Relatórios: JasperReports

Frontend: Thymeleaf, Bootstrap

📊 Modelagem do Banco de Dados
Cliente: Informações dos clientes.

Produto: Detalhes dos produtos.

Pedido: Registro de pedidos.

ItemPedido: Relaciona produtos e pedidos.

🚀 Como Executar
Pré-requisitos
Java 17+

PostgreSQL

Maven

Passos
Clone o repositório:

bash
Copy
git clone https://github.com/seu-usuario/dashboard-vendas.git
Configure o banco de dados no application.properties.

Execute a aplicação:

bash
Copy
mvn spring-boot:run
Acesse:

Dashboard: http://localhost:8080/dashboard

API: http://localhost:8080

📝 Endpoints da API
Clientes: GET /clientes, POST /clientes, PUT /clientes/{id}, DELETE /clientes/{id}

Produtos: GET /produtos, POST /produtos, PUT /produtos/{id}, DELETE /produtos/{id}

Pedidos: GET /pedidos, POST /pedidos, GET /pedidos/total-vendas
