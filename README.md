# Dashboard de Vendas
Um sistema de gerenciamento de vendas desenvolvido com Java, Spring Boot, PostgreSQL e JasperReports. Oferece cadastro de produtos, clientes e pedidos, além de um dashboard com estatísticas de vendas e geração de relatórios em PDF/Excel.

🚀 Funcionalidades
Cadastro de Produtos, Clientes e Pedidos
Dashboard com Estatísticas de Vendas
Relatórios Dinâmicos em PDF/Excel
Otimização com Cache

🛠️ Tecnologias
Backend: Java, Spring Boot, Spring Data JPA
Banco de Dados: MySQL
Relatórios: JasperReports
Frontend: Thymeleaf, Bootstrap

📊 Modelagem do Banco de Dados
Cliente: Informações dos clientes.
Produto: Detalhes dos produtos.
Pedido: Registro de pedidos.
ItemPedido: Relaciona produtos e pedidos.

📝 Endpoints da API (Até o momento)
Clientes: GET /clientes, POST /clientes, PUT /clientes/{id}, DELETE /clientes/{id}
Produtos: GET /produtos, POST /produtos, PUT /produtos/{id}, DELETE /produtos/{id}
Pedidos: GET /pedidos, POST /pedidos, GET /pedidos/total-vendas

No futuro integrar com uma LLM a fim de traduzir dados e levar ao cliente na forma de linguagem natuaral. 
