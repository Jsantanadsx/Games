package br.com.Games.Games.services;

import br.com.Games.Games.models.User;
import br.com.Games.Games.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserRepository repository;

    public List<User> gettAll() {
        return repository.findAll();
    }

    public User create(User user) {
        return repository.save(user);
    }

    public User getById(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new RuntimeException("Usuário não encontrado"));
    }

    public void delete(Long id) {
        getById(id);
        repository.deleteById(id);
    }
}
