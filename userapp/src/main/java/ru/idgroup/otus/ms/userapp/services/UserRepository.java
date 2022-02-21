package ru.idgroup.otus.ms.userapp.services;

import org.springframework.data.repository.CrudRepository;
import ru.idgroup.otus.ms.userapp.model.User;

public interface UserRepository extends CrudRepository<User, Integer> {
}
