#  Sistema de Gerenciamento de Loja de Roupas (Spring Boot)

Este é um projeto desenvolvido em **Java** com o framework **Spring Boot** focado no controle operacional de uma loja de vestuário. O sistema utiliza **MySQL** para persistência de dados, utilizando o **Spring Data JPA** para facilitar a manipulação do inventário, preços e registros de produtos.

## Funcionalidades

* **Gerenciamento de Produtos:** CRUD completo (Cadastro, Listagem, Edição e Exclusão).
* **Controle de Estoque:** Monitoramento das quantidades disponíveis via banco de dados.
* **Integração com MySQL:** Persistência de dados configurada via Spring Data JPA.
* **API REST:** Estrutura preparada para receber requisições HTTP através de Controllers.

## Tecnologias Utilizadas

* **Linguagem:** Java (JDK 17 ou superior)
* **Framework:** Spring Boot
* **Banco de Dados:** MySQL 8.0
* **ORM:** Spring Data JPA / Hibernate
* **IDE:** IntelliJ IDEA (recomendada)

## Configuração do Ambiente

### 1. Banco de Dados
Certifique-se de ter o MySQL instalado. Execute o script abaixo:

```sql
CREATE DATABASE loja;
```

## 2. Configuração do Projeto
No arquivo src/main/resources/application.properties, configure as credenciais do seu banco:

```
spring.datasource.url=jdbc:mysql://localhost:3306/loja
spring.datasource.username=seu_usuario_root
spring.datasource.password=sua_senha
spring.jpa.hibernate.ddl-auto=update
```

## Como Executar
1. Clone este repositório:

git clone [https://github.com/diegoeiti/JavaFoundations.git](https://github.com/diegoeiti/JavaFoundations.git)
cd JavaFoundations/Aula%2009%20-%20SpringBoot

2. Execute o projeto:

Importe na sua IDE como um projeto Maven.

Execute a classe LojaroupaApplication.java.

 Estrutura do Projeto
src/main/java/com/example/lojaroupa/
├── LojaroupaApplication.java    # Classe principal do Spring Boot

├── controller/

│   └── ControllerRoupa.java     # Endpoints da API

└── model/

├── Roupa.java               # Entidade JPA

├── DadosRoupa.java          # DTO (Data Transfer Object)

└── RoupaRepository.java     # Interface de acesso ao banco (JPA)

src/main/resources/

└── application.properties       # Configurações do Spring e Banco de Dados

## Contribuindo

Faça um Fork do projeto

Crie uma branch (git checkout -b feature/nova-funcionalidade)

Commit suas alterações (git commit -m 'Adiciona nova funcionalidade')

Push para a branch (git push origin feature/nova-funcionalidade)

Abra um Pull Request

Desenvolvido por Diego Eiti Nakashima Fortunato Projeto de portfólio para fins acadêmicos e profissionais.

📧 Contato: diegoeiti96@gmail.com

🔗 LinkedIn: https://www.linkedin.com/in/diego-eiti-nakashima-fortunato-83852b227/

🔗 Repositório: https://github.com/diegoeiti/JavaFoundations/tree/main/Aula%2009%20-%20SpringBoot


