## 👨‍💻 Integrantes

Projeto realizado por:

- João Victor Santana — RM: 566063  
- Felipe Ribeiro Salles de Camargo — RM: 565224  

# 🎮 Games API

API REST desenvolvida com Spring Boot para gerenciamento de jogos.

## 🚀 Tecnologias
- Java 21
- Spring Boot
- Spring Data JPA
- H2 Database
- Lombok

## 📌 Funcionalidades
- Criar jogo
- Listar jogos
- Buscar por ID
- Atualizar jogo
- Deletar jogo

## 🔗 Endpoints

GET /games  
POST /games  
GET /games/{id}  
PUT /games/{id}  
DELETE /games/{id}

## 🧪 Exemplo JSON

{
  "title": "Dark Souls 3",
  "genre": "RPG",
  "rating": 10,
  "releaseDate": "2016-03-24"
}

## ▶️ Como rodar

1. Clonar o repositório  
2. Rodar a aplicação  
3. Acessar: http://localhost:8080/games  

## 🗄️ H2 Console
http://localhost:8080/h2-console
