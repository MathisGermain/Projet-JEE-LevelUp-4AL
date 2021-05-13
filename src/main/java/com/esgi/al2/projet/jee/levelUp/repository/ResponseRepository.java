package com.esgi.al2.projet.jee.levelUp.repository;

import com.esgi.al2.projet.jee.levelUp.model.Exercise;
import com.esgi.al2.projet.jee.levelUp.model.Response;
import com.esgi.al2.projet.jee.levelUp.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import javax.validation.constraints.NotNull;
import java.util.List;
import java.util.Optional;

public interface ResponseRepository extends JpaRepository<Response, Integer> {

    List<Response> findAllByUser(User user);

    List<Response> findAllByExercise(Exercise exercise);

    Optional<Response> findByUserAndExercise(User user, Exercise exercise);

    @NotNull Optional<Response> findById(@NotNull Integer id);

}
