<div align="center">

# 📇 Lista de Contatos API

### Minha primeira API REST com Spring Boot

![Java](https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white)
![Spring Boot](https://img.shields.io/badge/Spring_Boot-6DB33F?style=for-the-badge&logo=spring-boot&logoColor=white)
![Maven](https://img.shields.io/badge/Maven-C71A36?style=for-the-badge&logo=apache-maven&logoColor=white)

</div>

---

## 📋 Sobre o Projeto

Este repositório contém minha primeira API REST desenvolvida com **Spring Boot**. É uma aplicação de gerenciamento de contatos que permite realizar operações CRUD (Create, Read, Update, Delete) de forma simples e eficiente.

O projeto foi criado como parte do meu aprendizado em desenvolvimento backend com Java e Spring Framework.

## ✨ Funcionalidades

- ✅ Criar novos contatos
- 📖 Listar todos os contatos
- 🔍 Buscar contato por ID
- ✏️ Atualizar informações de contatos
- 🗑️ Excluir contatos

## 🛠️ Tecnologias Utilizadas

- **Java** - Linguagem de programação
- **Spring Boot** - Framework para desenvolvimento de aplicações Java
- **Spring Web** - Para criar APIs RESTful
- **Maven** - Gerenciador de dependências
- **H2 Database / MySQL** - Banco de dados (ajuste conforme sua implementação)

## 🚀 Como Executar o Projeto

### Pré-requisitos

Antes de começar, você precisa ter instalado em sua máquina:
- [Java JDK 17+](https://www.oracle.com/java/technologies/downloads/)
- [Maven](https://maven.apache.org/download.cgi)
- [Git](https://git-scm.com)

### Rodando a aplicação

```bash
# Clone este repositório
git clone https://github.com/kauaafeelix/first-api.git

# Acesse a pasta do projeto
cd first-api/lista-de-contatos

# Execute o projeto com Maven
./mvnw spring-boot:run

# Ou se estiver no Windows
mvnw.cmd spring-boot:run
```

A API estará rodando em `http://localhost:8080`

## 📌 Endpoints da API

| Método | Endpoint | Descrição |
|--------|----------|-----------|
| GET | `/contatos` | Lista todos os contatos |
| GET | `/contatos/{id}` | Busca um contato por ID |
| POST | `/contatos` | Cria um novo contato |
| PUT | `/contatos/{id}` | Atualiza um contato existente |
| DELETE | `/contatos/{id}` | Deleta um contato |

### Exemplo de JSON para criar/atualizar contato:

```json
{
  "nome": "João Silva",
  "telefone": "(11) 98765-4321",
  "email": "joao.silva@email.com"
}
```

## 📚 Aprendizados

Durante o desenvolvimento deste projeto, aprendi sobre:

- Arquitetura REST
- Anotações do Spring Boot (`@RestController`, `@RequestMapping`, etc)
- Operações CRUD
- Injeção de dependências
- Persistência de dados
- Configuração de projetos Spring

## 🤝 Contribuindo

Contribuições são sempre bem-vindas! Sinta-se à vontade para abrir issues ou enviar pull requests.

## 👨‍💻 Autor

Desenvolvido com ☕ por **Kauã Felix**

[![GitHub](https://img.shields.io/badge/GitHub-100000?style=for-the-badge&logo=github&logoColor=white)](https://github.com/kauaafeelix)

---

<div align="center">
  <sub>⭐ Deixe uma estrela se este projeto te ajudou!</sub>
</div>
