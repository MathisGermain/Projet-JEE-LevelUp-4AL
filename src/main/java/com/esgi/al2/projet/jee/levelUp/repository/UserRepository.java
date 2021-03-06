package com.esgi.al2.projet.jee.levelUp.repository;

import com.esgi.al2.projet.jee.levelUp.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {
    Optional<User> findByEmail(String email);
    Optional<User> findByUsername(String username);
    Optional<User> findById(Integer id);

    Boolean existsByEmail(String email);
    Boolean existsByUsername(String username);

    Optional<User> findByEmailAndPassword(String email, String password);


}
