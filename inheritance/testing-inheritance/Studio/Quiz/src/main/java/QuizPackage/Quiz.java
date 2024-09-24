package QuizPackage;

import java.util.ArrayList;

public class Quiz {
    private String quizName;
    private ArrayList<Question> QuestionList;
    private int numPointsQuiz;

    public Quiz(ArrayList<Question> questionList) {
        QuestionList = questionList;
    }


}
