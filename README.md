## 📁 Estrutura do Projeto

```
first-api/
├── lista-de-contatos/
│   ├── src/
│   │   ├── main/
│   │   │   ├── java/
│   │   │   │   └── kauafelix/
│   │   │   │       └── lista_de_contatos/
│   │   │   │           ├── controller/          # Controllers REST
│   │   │   │           │   └── ContactController.java
│   │   │   │           ├── dto/                 # Data Transfer Objects
│   │   │   │           │   ├── DtoContactRequest.java
│   │   │   │           │   └── DtoContactResponse.java
│   │   │   │           ├── exceptions/          # Tratamento de exceções
│   │   │   │           │   ├── GlobalExceptionHandler.java
│   │   │   │           │   └── InvalidPhoneNumberException.java
│   │   │   │           ├── mapper/              # Conversão entre DTO e Entity
│   │   │   │           │   └── ContactMapper.java
│   │   │   │           ├── model/               # Entidades JPA
│   │   │   │           │   └── Contact.java
│   │   │   │           ├── repository/          # Interfaces Repository
│   │   │   │           │   └── ContactRepository.java
│   │   │   │           ├── service/             # Lógica de negócio
│   │   │   │           │   └── ContactService.java
│   │   │   │           └── ListaDeContatosApplication.java
│   │   │   └── resources/
│   │   │       └── application.properties       # Configurações
│   │   └── test/
│   │       └── java/                            # Testes unitários
│   │           └── kauafelix/lista_de_contatos/
│   │               └── ListaDeContatosApplicationTests.java
│   ├── .mvn/                                    # Maven wrapper
│   ├── mvnw                                     # Maven wrapper Unix
│   ├── mvnw.cmd                                 # Maven wrapper Windows
│   ├── pom.xml                                  # Dependências Maven
│   ├── .gitignore
│   └── .gitattributes
└── README.md

```
