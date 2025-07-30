# 📦 First Spring App

Este é o meu primeiro projeto utilizando o framework **Spring Boot** em Java! 🚀

---

## 👋 Sobre o Projeto

Neste projeto, aprendi a criar uma aplicação web básica com Spring Boot.  
O principal objetivo foi imprimir na tela o clássico **Hello World**, entendendo a estrutura de uma aplicação Spring, incluindo:

- Criação de um controller (`HelloWorldController`)
- Injeção de dependência via construtor (`HelloWorldService`)
- Configuração inicial do projeto
- Estrutura de pastas padrão do Spring Boot

---



## 🎥 Vídeo de Estudo
Aprendi através deste excelente vídeo no YouTube:
[📺 Spring Boot para Iniciantes
](https://youtu.be/YY_hf0FOIcU?si=yasepl4fQianRqMG)
---

## 🛠️ Tecnologias Utilizadas

- Java 17
- Spring Boot
- Maven
- IntelliJ IDEA

---

## ✨ O que eu aprendi

- Como estruturar um projeto Spring Boot
- Como criar rotas HTTP com @RestController
- Como usar @RequestBody, @RequestParam e @PathVariable
- Conceitos iniciais de injeção de dependência
- Separar o código em camadas de responsabilidade (Controller, Service, Domain)

## 📁 Estrutura do Projeto
```bash

src/
├── main/
│   ├── java/
│   │   └── com.kipper.first_spring_app/
│   │       ├── configuration/
│   │       │   └── HelloConfiguration.java
│   │       ├── controller/
│   │       │   └── HelloWorldController.java
│   │       ├── domain/
│   │       │   └── User.java
│   │       ├── service/
│   │       │   └── HelloWorldService.java
│   │       └── FirstSpringAppApplication.java
│   └── resources/
│       ├── static/
│       ├── templates/
│       ├── application.properties
│       └── application-dev.properties
├── test/
│   └── java/
│       └── com.kipper.first_spring_app/
│           └── FirstSpringAppApplicationTests.java


