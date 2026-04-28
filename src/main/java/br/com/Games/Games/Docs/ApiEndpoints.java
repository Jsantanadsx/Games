package br.com.Games.Games.Docs;

/**
 * DOCUMENTAÇÃO DOS ENDPOINTS DA API
 *
 * Base URL:
 * http://localhost:8080
 *
 * ============================================
 * GAMES
 * ============================================
 *
 * GET /games
 * Listar todos os jogos
 *
 * GET /games/{id}
 * Buscar jogo por ID
 *
 * POST /games
 * Criar novo jogo
 *
 * Exemplo JSON:
 * {
 *   "title": "Elden Ring",
 *   "genre": "RPG",
 *   "rating": 10,
 *   "releaseDate": "2022-02-25"
 * }
 *
 * PUT /games/{id}
 * Atualizar jogo
 *
 * DELETE /games/{id}
 * Deletar jogo
 *
 * FILTROS:
 *
 * GET /games?genre=RPG
 * GET /games?rating=10
 * GET /games?title=elden
 *
 * PAGINAÇÃO:
 *
 * GET /games/page?page=0&size=2
 *
 * ORDENAÇÃO:
 *
 * GET /games/page?sort=rating,desc
 *
 * ============================================
 * USERS
 * ============================================
 *
 * GET /users
 * Listar usuários
 *
 * GET /users/{id}
 * Buscar usuário por ID
 *
 * POST /users
 * Criar usuário
 *
 * Exemplo JSON:
 * {
 *   "name": "João",
 *   "email": "joao@email.com"
 * }
 *
 * PUT /users/{id}
 * Atualizar usuário
 *
 * DELETE /users/{id}
 * Deletar usuário
 *
 * ============================================
 * REVIEWS
 * ============================================
 *
 * GET /reviews
 * Listar reviews
 *
 * GET /reviews/{id}
 * Buscar review por ID
 *
 * POST /reviews
 * Criar review (com relacionamento)
 *
 * Exemplo JSON:
 * {
 *   "score": 10,
 *   "comment": "Obra-prima",
 *   "game": { "id": 1 },
 *   "user": { "id": 1 }
 * }
 *
 * DELETE /reviews/{id}
 * Deletar review
 *
 * ============================================
 * H2 DATABASE
 * ============================================
 *
 * Console:
 * http://localhost:8080/h2-console
 *
 * Username: RiSa
 * Password: risajava
 *
 * - Relacionamento entre Game, User e Review
 * - Suporte a filtros, paginação e ordenação
 *
 */
public class ApiEndpoints {
    // Classe apenas para documentação
}