# 🎮 Games API

API REST desenvolvida com Spring Boot para gerenciamento de jogos, usuários e avaliações.

## 🚀 Tecnologias
- Java 21
- Spring Boot
- Spring Data JPA
- H2 Database
- Lombok

## 📌 Funcionalidades
- CRUD de Games
- CRUD de Users
- CRUD de Reviews
- Filtros por gênero, nota e título
- Paginação e ordenação

## 🔗 Endpoints principais

### Games
GET /games  
GET /games/{id}  
POST /games  
PUT /games/{id}  
DELETE /games/{id}  

GET /games?genre=RPG  
GET /games/page?page=0&size=2  

### H2 Console
http://localhost:8080/h2-console

## 👨‍💻 Integrantes
João Victor Santana – RM 566063  
Felipe Ribeiro Salles de Camargo – RM 565224
