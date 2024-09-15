package com.picpaysimplicado.repositories;

import com.picpaysimplicado.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.lang.annotation.Documented;
import java.util.Optional;

public interface IUserRepository extends JpaRepository<User, Long> {
    public Optional<User> findUserById(Long id);
    public Optional<User> findUserByDocument(String document);
}
