package com.sadi.a2.service;



import com.sadi.a2.model.QuizResult;

import java.util.List;

public interface QuizResultService {
    public void addQuizResult(QuizResult qr);
    public void updateQuizResult(QuizResult qr);
    public List<QuizResult> listQuizResults();
    public QuizResult getQuizResultById(int id);
    public void removeQuizResult(int id);
}
