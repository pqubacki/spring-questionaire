package com.solera.questionaire.service;

import com.solera.questionaire.model.Question;
import com.solera.questionaire.repository.QuestionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;

@Service
public class QuestionService {
    
    @Autowired
    QuestionRepository questionRepository;

    public List<Question> getAllQuestions() {
        return questionRepository.findAll();
    }

    public Question getQuestion(Long id) {
        Optional<Question> found = questionRepository.findById(id);
        if (found.isPresent()) {
            return found.get();
        } else {
            throw new NoSuchElementException("Question " + id + "not found.");
        }
    }
    public void addQuestion(Question question) {
        questionRepository.save(question);
    }
}
