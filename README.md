# 👥 Employee Control

Este projeto permite o registro de funcionários e seus endereços, com persistência dos dados em um banco MySQL. O sistema segue o padrão de camadas para facilitar a manutenção e organização do código

## 🛠️ Tecnologias Utilizadas

 - Java
 - SQL
 - IntelliJ IDEA
 - MySQL Connector/J

## 🚀 Como executar

 1. Clone o repositório: git clone https://github.com/jrsrezende/employee-control.git
 2. Configure o banco de dados usando o script em src/sql/script.sql.
 3. Execute a classe principal em src/application/Main.java.

## 📁 Camadas do projeto

 - `application/`: Ponto de entrada da aplicação.
 - `controllers/`: Controla o fluxo entre a interface e as regras de negócio
 - `entities/`: Representa as entidades do domínio (Employee, Address).
 - `repositories/`: Responsável pela persistência e acesso aos dados.
 - `sql/`: Scripts para criação e manipulação do banco de dados.
