package QuizPackage;

public class TrueFalse extends Question{
    // Fields
    private boolean AnswerSelection;
    private boolean CorrectAnswer;

    // Constructor
    public TrueFalse(String text, int numPoints, boolean answerSelection, boolean correctAnswer) {
        super(text, numPoints);
        AnswerSelection = answerSelection;
        CorrectAnswer = correctAnswer;
    }

    // Methods
    @Override
    public void displayAnswers() {
        // Print AnswerSelection to user
    }

    @Override
    public double scoreAnswers() {
        // if answerSelection - CorrectAnswer
            setCorrectAnswerPoints(numPoints);
        // else:
            setCorrectAnswerPoints(0);
        return 0;
    }
}
