package ru.idgroup.otus.ms.userapp.services;

import ru.idgroup.otus.ms.userapp.model.User;

import java.util.List;
import java.util.Optional;

public interface UserService {

    List<User> findAll();
    Optional<User> findById(Integer id);
    void deleteById(Integer id);
    User save(User user);
}
