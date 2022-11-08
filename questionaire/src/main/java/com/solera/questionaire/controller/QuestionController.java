package com.solera.questionaire.controller;

import com.solera.questionaire.model.Question;
import com.solera.questionaire.service.QuestionService;
import jakarta.websocket.server.PathParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
public class QuestionController {
    @Autowired
    QuestionService questionService;

    @GetMapping("/questions")
    public List<Question> getAllQuestions() {
        return questionService.getAllQuestions();
    }

    @GetMapping("/questions/{id}")
    public Question getQuestion(@PathParam("id") Long id) {
        return questionService.getQuestion(id);
    }

    @PostMapping("/questions")
    public void createQuestion(@RequestBody Question question) {
        questionService.addQuestion(question);
    }
}
