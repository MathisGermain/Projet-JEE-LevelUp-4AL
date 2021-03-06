package com.esgi.al2.projet.jee.levelUp.service;

import com.esgi.al2.projet.jee.levelUp.model.Exercise;
import com.esgi.al2.projet.jee.levelUp.repository.ExerciseRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class ExerciseService {

    private final ExerciseRepository exerciseRepository;

    public Exercise create(Exercise exercise) throws Exception {
        if(!(exerciseRepository.existsByTitle(exercise.getTitle()))){
            return exerciseRepository.save(exercise);
        }
        throw new Exception("This exercise exists yet");
    }


    public Optional<Exercise> findById(Integer id) {
        return exerciseRepository.findById(id);
    }

    public Optional<Exercise> findByTitle(String title) {
        return exerciseRepository.findByTitle(title);
    }

    public List<Exercise> getAll() {
        return exerciseRepository.findAll();
    }
}
