<div align="center">

# 📇 Lista de Contatos API

### API REST para gerenciamento de contatos com Spring Boot e PostgreSQL

![Java](https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white)
![Spring Boot](https://img.shields.io/badge/Spring_Boot-6DB33F?style=for-the-badge&logo=spring-boot&logoColor=white)
![PostgreSQL](https://img.shields.io/badge/PostgreSQL-316192?style=for-the-badge&logo=postgresql&logoColor=white)
![Docker](https://img.shields.io/badge/Docker-2496ED?style=for-the-badge&logo=docker&logoColor=white)
![Maven](https://img.shields.io/badge/Maven-C71A36?style=for-the-badge&logo=apache-maven&logoColor=white)

[Sobre](#-sobre-o-projeto) • [Funcionalidades](#-funcionalidades) • [Tecnologias](#️-tecnologias) • [Como Executar](#-como-executar) • [API](#-endpoints) • [Banco de Dados](#-banco-de-dados) • [Contribuindo](#-como-contribuir)

</div>

---

## 📋 Sobre o Projeto

A **Lista de Contatos API** é uma aplicação RESTful desenvolvida com Spring Boot que oferece um sistema completo de gerenciamento de contatos. Este projeto representa minha primeira incursão no desenvolvimento de APIs REST, implementando as melhores práticas de arquitetura e design de software.

A API permite realizar operações CRUD (Create, Read, Update, Delete) de forma simples, segura e eficiente, utilizando PostgreSQL como banco de dados relacional e Docker para containerização.

### 🎯 Objetivos do Projeto

- Compreender os fundamentos de APIs RESTful
- Dominar o ecossistema Spring Boot
- Trabalhar com banco de dados PostgreSQL
- Utilizar Docker para containerização
- Aplicar boas práticas de desenvolvimento backend
- Implementar operações CRUD completas
- Estruturar projetos Java profissionalmente

---

## ✨ Funcionalidades

- ✅ **Criar Contatos** - Adicione novos contatos ao sistema
- 📖 **Listar Contatos** - Visualize todos os contatos cadastrados
- 🔍 **Buscar por ID** - Encontre contatos específicos rapidamente
- ✏️ **Atualizar Dados** - Modifique informações de contatos existentes
- 🗑️ **Excluir Contatos** - Remova contatos do sistema
- 💾 **Persistência PostgreSQL** - Dados armazenados em banco relacional
- ⚡ **Respostas Rápidas** - Performance otimizada para operações
- 🛡️ **Tratamento de Erros** - Validações e mensagens de erro amigáveis

---

## 🛠️ Tecnologias

Este projeto foi desenvolvido utilizando as seguintes tecnologias:

| Tecnologia | Descrição |
|-----------|-----------|
| **Java 21** | Linguagem de programação moderna e robusta |
| **Spring Boot 4.0.2** | Framework para criação de aplicações Java |
| **Spring Data JPA** | Abstração de acesso a dados e ORM |
| **Spring Web MVC** | Módulo para desenvolvimento de APIs RESTful |
| **PostgreSQL** | Banco de dados relacional robusto e escalável |
| **Docker** | Containerização do banco de dados |
| **Maven** | Gerenciamento de dependências e build |
| **DBeaver** | Ferramenta de gerenciamento de banco de dados |
| **Spring DevTools** | Hot reload para desenvolvimento ágil |

---

## 🚀 Como Executar

### Pré-requisitos

Certifique-se de ter as seguintes ferramentas instaladas:

- ☕ [Java JDK 21+](https://www.oracle.com/java/technologies/downloads/)
- 📦 [Maven 3.6+](https://maven.apache.org/download.cgi)
- 🐳 [Docker](https://www.docker.com/get-started)
- 🔧 [Git](https://git-scm.com)
- 💻 IDE de sua preferência (IntelliJ IDEA, Eclipse, VS Code)
- 🗄️ [DBeaver](https://dbeaver.io/download/) (opcional, para visualizar o banco)

---

## 🐳 Configurando o Banco de Dados

### 1. Subindo o PostgreSQL com Docker

```bash
# Criar e executar container PostgreSQL
docker run --name postgres-contatos \
  -e POSTGRES_DB=lista_contatos \
  -e POSTGRES_USER=admin \
  -e POSTGRES_PASSWORD=admin123 \
  -p 5432:5432 \
  -d postgres:16

# Verificar se o container está rodando
docker ps

# Ver logs do container
docker logs postgres-contatos
```

### 2. Conectando com DBeaver

1. Abra o DBeaver
2. Clique em **"Nova Conexão"** ou `Database` → `New Database Connection`
3. Selecione **PostgreSQL**
4. Configure os parâmetros:
   - **Host:** `localhost`
   - **Port:** `5432`
   - **Database:** `lista_contatos`
   - **Username:** `admin`
   - **Password:** `admin123`
5. Clique em **"Test Connection"** e depois **"Finish"**

### 3. Configuração do Spring Boot

Crie ou edite o arquivo `src/main/resources/application.properties`:

```properties
# Configuração do PostgreSQL
spring.datasource.url=jdbc:postgresql://localhost:5432/lista_contatos
spring.datasource.username=admin
spring.datasource.password=admin123
spring.datasource.driver-class-name=org.postgresql.Driver

# Configuração do JPA/Hibernate
spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
spring.jpa.properties.hibernate.format_sql=true
spring.jpa.properties.hibernate.dialect=org.hibernate.dialect.PostgreSQLDialect

# Configuração do servidor
server.port=8080
```

---

## 🔧 Instalação e Execução

```bash
# 1. Clone o repositório
git clone https://github.com/kauaafeelix/first-api.git

# 2. Navegue até o diretório do projeto
cd first-api/lista-de-contatos

# 3. Certifique-se de que o PostgreSQL está rodando no Docker
docker ps | grep postgres-contatos

# 4. Execute a aplicação
./mvnw spring-boot:run

# Windows PowerShell/CMD
mvnw.cmd spring-boot:run
```

✅ A API estará disponível em: **`http://localhost:8080`**

### 🛑 Comandos Úteis do Docker

```bash
# Parar o container
docker stop postgres-contatos

# Iniciar o container novamente
docker start postgres-contatos

# Remover o container
docker rm -f postgres-contatos

# Acessar o PostgreSQL via linha de comando
docker exec -it postgres-contatos psql -U admin -d lista_contatos
```

---

## 📌 Endpoints

### Base URL
```
http://localhost:8080
```

### Documentação da API

| Método | Endpoint | Descrição | Status |
|--------|----------|-----------|--------|
| `GET` | `/contatos` | Lista todos os contatos | 200 OK |
| `GET` | `/contatos/{id}` | Busca um contato específico | 200 OK |
| `POST` | `/contatos` | Cria um novo contato | 201 Created |
| `PUT` | `/contatos/{id}` | Atualiza um contato existente | 200 OK |
| `DELETE` | `/contatos/{id}` | Remove um contato | 204 No Content |

### 📝 Exemplos de Requisições

#### Criar um novo contato

```bash
POST /contatos
Content-Type: application/json

{
  "nome": "João Silva",
  "telefone": "(11) 98765-4321",
  "email": "joao.silva@email.com"
}
```

**Resposta (201 Created):**
```json
{
  "id": 1,
  "nome": "João Silva",
  "telefone": "(11) 98765-4321",
  "email": "joao.silva@email.com"
}
```

#### Listar todos os contatos

```bash
GET /contatos
```

**Resposta (200 OK):**
```json
[
  {
    "id": 1,
    "nome": "João Silva",
    "telefone": "(11) 98765-4321",
    "email": "joao.silva@email.com"
  },
  {
    "id": 2,
    "nome": "Maria Santos",
    "telefone": "(21) 99876-5432",
    "email": "maria.santos@email.com"
  }
]
```

#### Buscar contato por ID

```bash
GET /contatos/1
```

**Resposta (200 OK):**
```json
{
  "id": 1,
  "nome": "João Silva",
  "telefone": "(11) 98765-4321",
  "email": "joao.silva@email.com"
}
```

#### Atualizar contato

```bash
PUT /contatos/1
Content-Type: application/json

{
  "nome": "João Silva Santos",
  "telefone": "(11) 98765-4321",
  "email": "joao.santos@email.com"
}
```

**Resposta (200 OK):**
```json
{
  "id": 1,
  "nome": "João Silva Santos",
  "telefone": "(11) 98765-4321",
  "email": "joao.santos@email.com"
}
```

#### Deletar contato

```bash
DELETE /contatos/1
```

**Resposta (204 No Content)**

### 🧪 Testando a API

Você pode testar a API usando:

#### Com cURL:
```bash
# Listar contatos
curl http://localhost:8080/contatos

# Criar contato
curl -X POST http://localhost:8080/contatos \
  -H "Content-Type: application/json" \
  -d '{"nome":"João Silva","telefone":"(11) 98765-4321","email":"joao@email.com"}'

# Buscar por ID
curl http://localhost:8080/contatos/1

# Atualizar contato
curl -X PUT http://localhost:8080/contatos/1 \
  -H "Content-Type: application/json" \
  -d '{"nome":"João Santos","telefone":"(11) 98765-4321","email":"joao@email.com"}'

# Deletar contato
curl -X DELETE http://localhost:8080/contatos/1
```

#### Outras ferramentas:
- **[Postman](https://www.postman.com/)** - Interface gráfica
- **[Insomnia](https://insomnia.rest/)** - Cliente REST
- **Thunder Client** - Extensão do VS Code

---

## 🗄️ Banco de Dados

### Estrutura da Tabela `contatos`

```sql
CREATE TABLE contatos (
    id BIGSERIAL PRIMARY KEY,
    nome VARCHAR(100) NOT NULL,
    telefone VARCHAR(20) NOT NULL,
    email VARCHAR(100) NOT NULL UNIQUE
);
```

### Queries Úteis

```sql
-- Ver todos os contatos
SELECT * FROM contatos;

-- Buscar contato por nome
SELECT * FROM contatos WHERE nome LIKE '%João%';

-- Contar total de contatos
SELECT COUNT(*) FROM contatos;

-- Deletar todos os contatos (cuidado!)
TRUNCATE TABLE contatos RESTART IDENTITY;
```

### Visualizando no DBeaver

1. Conecte-se ao banco `lista_contatos`
2. Navegue até **Schemas → public → Tables → contatos**
3. Clique com botão direito → **View Data**
4. Você pode editar, adicionar ou remover registros diretamente

---

## 📁 Estrutura do Projeto

```
first-api/
├── .idea/                              # Configurações da IDE
├── lista-de-contatos/
│   ├── .mvn/                          # Maven wrapper
│   ├── src/
│   │   ├── main/
│   │   │   ├── java/
│   │   │   │   └── kauafelix/lista_de_contatos/
│   │   │   │       ├── controller/
│   │   │   │       │   └── ContactController.java
│   │   │   │       ├── dto/
│   │   │   │       │   ├── DtoContactRequest.java
│   │   │   │       │   └── DtoContactResponse.java
│   │   │   │       ├── exceptions/
│   │   │   │       │   ├── GlobalExceptionHandler.java
│   │   │   │       │   └── InvalidPhoneNumberException.java
│   │   │   │       ├── mapper/
│   │   │   │       │   └── ContactMapper.java
│   │   │   │       ├── model/
│   │   │   │       │   └── Contact.java
│   │   │   │       ├── repository/
│   │   │   │       │   └── ContactRepository.java
│   │   │   │       ├── service/
│   │   │   │       │   └── ContactService.java
│   │   │   │       └── ListaDeContatosApplication.java
│   │   │   └── resources/
│   │   │       └── application.properties
│   │   └── test/
│   │       └── java/kauafelix/lista_de_contatos/
│   │           └── ListaDeContatosApplicationTests.java
│   ├── .gitattributes
│   ├── .gitignore
│   ├── mvnw
│   ├── mvnw.cmd
│   └── pom.xml
└── README.md
```

---

## 📚 Conceitos Aprendidos

Durante o desenvolvimento deste projeto, foram explorados os seguintes conceitos:

### 🎓 Backend & APIs
- ✅ Arquitetura REST e seus princípios
- ✅ Métodos HTTP (GET, POST, PUT, DELETE)
- ✅ Códigos de status HTTP
- ✅ Padrão de projeto MVC (Model-View-Controller)
- ✅ Camadas de aplicação (Controller, Service, Repository)

### 🎓 Spring Framework
- ✅ Injeção de Dependências
- ✅ Inversão de Controle (IoC)
- ✅ Spring Data JPA
- ✅ Anotações do Spring (@RestController, @Service, @Repository, @Entity)
- ✅ Configuração de aplicações Spring Boot

### 🎓 Banco de Dados
- ✅ PostgreSQL e suas características
- ✅ JPA (Java Persistence API)
- ✅ Mapeamento Objeto-Relacional (ORM)
- ✅ Operações CRUD
- ✅ Relacionamentos entre entidades
- ✅ Gerenciamento com DBeaver

### 🎓 DevOps & Ferramentas
- ✅ Containerização com Docker
- ✅ Gerenciamento de containers
- ✅ Conexão com bancos de dados externos
- ✅ Versionamento de código com Git

### 🎓 Boas Práticas
- ✅ Separação de responsabilidades
- ✅ Clean Code
- ✅ Tratamento de exceções
- ✅ Configuração externalizada

---

## 🐳 Docker Compose (Opcional)

Para facilitar ainda mais, você pode criar um `docker-compose.yml`:

```yaml
version: '3.8'

services:
  postgres:
    image: postgres:16
    container_name: postgres-contatos
    environment:
      POSTGRES_DB: lista_contatos
      POSTGRES_USER: admin
      POSTGRES_PASSWORD: admin123
    ports:
      - "5432:5432"
    volumes:
      - postgres_data:/var/lib/postgresql/data
    networks:
      - contatos-network

volumes:
  postgres_data:

networks:
  contatos-network:
    driver: bridge
```

Depois, basta executar:
```bash
docker-compose up -d
```

---

## 🔮 Melhorias Futuras

- [ ] Implementar paginação para listagem de contatos
- [ ] Adicionar autenticação JWT
- [ ] Criar filtros de busca avançados
- [ ] Implementar validação de dados com Bean Validation
- [ ] Adicionar documentação Swagger/OpenAPI
- [ ] Implementar testes unitários e de integração
- [ ] Configurar CI/CD com GitHub Actions
- [ ] Adicionar logs estruturados com Logback
- [ ] Implementar cache com Redis
- [ ] Criar migrations com Flyway ou Liquibase
- [ ] Adicionar métricas com Spring Actuator
- [ ] Dockerizar a aplicação Spring Boot

---

## 🤝 Como Contribuir

Contribuições são sempre bem-vindas! Se você deseja contribuir com este projeto:

1. Faça um fork do projeto
2. Crie uma branch para sua feature (`git checkout -b feature/MinhaFeature`)
3. Commit suas mudanças (`git commit -m 'Adiciona nova feature'`)
4. Push para a branch (`git push origin feature/MinhaFeature`)
5. Abra um Pull Request

---

## 📄 Licença

Este projeto está sob a licença MIT. Veja o arquivo [LICENSE](LICENSE) para mais detalhes.

---

## 👤 Autor

Desenvolvido com ☕ e 💙 por **Kauã Felix**

[![GitHub](https://img.shields.io/badge/GitHub-100000?style=for-the-badge&logo=github&logoColor=white)](https://github.com/kauaafeelix)
[![LinkedIn](https://img.shields.io/badge/LinkedIn-0077B5?style=for-the-badge&logo=linkedin&logoColor=white)](https://www.linkedin.com/in/seu-linkedin)

---

## 🙏 Agradecimentos

- Comunidade Spring Boot
- Documentação oficial do PostgreSQL
- Tutoriais e cursos que me ajudaram nessa jornada

---

<div align="center">

### ⭐ Deixe uma estrela se este projeto foi útil para você!

**[⬆ Voltar ao topo](#-lista-de-contatos-api)**

</div>
