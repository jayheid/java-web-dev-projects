package QuizPackage;

import java.util.ArrayList;

public class MultipleChoice extends Question{
    private ArrayList<String> AnswerChoices;
    private String AnswerSelection;
    private String CorrectAnswer;

    public MultipleChoice(String text, int numPoints, ArrayList<String> answerChoices, String answerSelection, String CorrectAnswer) {
        super(text, numPoints);
        AnswerChoices = answerChoices;
        AnswerSelection = answerSelection;
        CorrectAnswer = CorrectAnswer;
    }

    @Override
    public void displayAnswers() {
        // For each item in AnswerChoices:
            // Display Item on a new line

    }

    @Override
    public double scoreAnswers() {
        // if AnswerSelection == Correct Answer
            // setCorrectAnswerPoints(this.numPoints);
        // else:
            // setCorrectAnswerPoints(0);
        return 0;
    }
}
