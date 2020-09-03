package com.chongliang.quizforfun.data;

import com.chongliang.quizforfun.model.Question;

import java.util.ArrayList;

public interface AnswerListAsyncResponse {
    void processFinished(ArrayList<Question> questionArrayList);
}
