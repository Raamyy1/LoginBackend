package com.lernApp.LoginAPI.repository;

import com.lernApp.LoginAPI.models.Answer;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface AnswerRepository extends CrudRepository<Answer, Integer> {
}