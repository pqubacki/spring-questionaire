package com.solera.questionaire.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity
public class Answer {
    @Id
    @GeneratedValue
    private int id;

    @ManyToOne
    private Question question;
    private String answerContent;
}
