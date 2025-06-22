# 📌 Convertendo o projeto Saga Orquestrado para Saga Coreografado

## 📖 Sobre o Projeto
Este repositório tem como objetivo estudar e aplicar conceitos avançados de arquitetura de microsserviços, com foco em transações distribuídas e implementação do padrão Saga, tanto na abordagem orquestrada quanto coreografada. Através de um projeto prático com Java 17, Spring Boot 3, Apache Kafka, PostgreSQL e MongoDB, são exploradas boas práticas e estratégias para garantir consistência e resiliência em sistemas distribuídos.

## 🚀 Tecnologias Utilizadas
- ☕ Java 17
- 🌱 Spring Framework 3
- 🎨 Thymeleaf
- 🐳 Docker & Docker Compose
- 📬 Apache Kafka
- 🐘 PostgreSQL
- 🍃 MongoDB

## O que será aplicado

- 📚 Conceitos e estratégias para tratamento de transações distribuídas
- 🤖 Implementação do padrão Saga coreografado com Java, Spring Boot e Kafka
- 🎭 Diferenças entre os padrões Orquestrado vs. Coreografado
- 🧱 Boas práticas na arquitetura de microsserviços
- 🗃️ Integração com bancos de dados PostgreSQL e MongoDB
- 🧪 Tratamento de falhas em ambientes distribuídos
- 🎁 Seção bônus com implementação do padrão Saga Coreografado

## 🏗️ Arquitetura
O projeto contempla a construção de 5 microsserviços, sendo:

  - Order-Service: microsserviço responsável apenas por gerar um pedido inicial, e receber uma notificação. Aqui que teremos endpoints REST para inciar o processo e recuperar os dados dos eventos. O banco de dados utilizado será o MongoDB.
    
  - Orchestrator-Service: microsserviço responsável por orquestrar todo o fluxo de execução da Saga, ele que saberá qual microsserviço foi executado e em qual estado, e para qual será o próximo microsserviço a ser enviado, este microsserviço também irá salvar o processo dos eventos. Este serviço não possui banco de dados.
    
  - Product-Validation-Service: microsserviço responsável por validar se o produto informado no pedido existe e está válido. Este microsserviço guardará a validação de um produto para o ID de um pedido. O banco de dados utilizado será o PostgreSQL.
    
  - Payment-Service: microsserviço responsável por realizar um pagamento com base nos valores unitários e quantidades informadas no pedido. Este microsserviço guardará a informação de pagamento de um pedido. O banco de dados utilizado será o PostgreSQL.
    
  - Inventory-Service: microsserviço responsável por realizar a baixa do estoque dos produtos de um pedido. Este microsserviço guardará a informação da baixa de
um produto para o ID de um pedido. O banco de dados utilizado será o PostgreSQL.

Toda a arquitetura é gerenciada via Docker Compose para facilitar a execução e o isolamento dos serviços.

## ▶️ Como Rodar o Projeto
1. **📥 Clone o repositório**
   ```sh
   git clone https://github.com/jardeljj/estudos_saga_coreografado
   cd estudos_saga_coreografado
   ```

2. **🐳 Suba os containers**
   ```sh
   docker-compose up --build
   ```

3. **🌍 Acesse os serviços**
   Os microsserviços estarão disponíveis nas portas definidas no docker-compose.yml. Certifique-se de que as portas não estejam em uso no seu ambiente local.

## 📚 Referências
- [📜 Documentação do Spring](https://docs.spring.io/spring-framework/docs/current/reference/html/)
- [📌 Guia do Spring MVC](https://docs.spring.io/spring-framework/docs/current/reference/html/web.html)
- [🐘 PostgreSQL Docs](https://www.postgresql.org/docs/)
- [🍃 MongoDB Docs](https://www.mongodb.com/pt-br/docs/)

## 🚧 Status do Projeto
🚀 Finalizado ✅

-JardelDev

