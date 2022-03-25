package com.lernApp.LoginAPI.controllers;

import com.lernApp.LoginAPI.models.Answer;
import com.lernApp.LoginAPI.security.services.AnswerService;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
@CrossOrigin(origins = "*", maxAge = 3600)

@RestController
@RequestMapping("/api/answer")
public class AnswerController {
    final
    AnswerService answerService;

    public AnswerController(AnswerService answerService) {
        this.answerService = answerService;
    }

    @PostMapping("/add")
    public void addAnswer (@Valid @RequestBody Answer answer ) {
        answerService.addNewAnswer(answer);
    }

}
