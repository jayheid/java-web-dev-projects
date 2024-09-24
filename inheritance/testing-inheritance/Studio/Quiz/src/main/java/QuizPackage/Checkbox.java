package QuizPackage;

import java.util.ArrayList;

public class Checkbox extends Question {

    // Fields
    private ArrayList<String> AnswerChoices;
    private ArrayList<String> AnswerSelection;
    private ArrayList<String> CorrectAnswers;

    // Constructor
    public Checkbox(String text, int numPoints, ArrayList<String> answerChoices, ArrayList<String> answerSelection, ArrayList<String> correctAnswers) {
        super(text, numPoints);
        AnswerChoices = answerChoices;
        AnswerSelection = answerSelection;
        CorrectAnswers = correctAnswers;
    }



    // Methods
    @Override
    public void displayAnswers() {
        // For each item in AnswerChoices:
            // Display Item on a new line
    }

    @Override
    public double scoreAnswers() {
        int correctCounter; // count each correct answer
        // For each item in AnswerSelection:
            // if item in CorrectAnswers
                // increment counter

        // Set Correct Answer Points to Counter / numPoints
        return 0;
    }
}
