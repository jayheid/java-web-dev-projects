package QuizPackage;

public abstract class Question {
    // Fields
    private String Text;
    private int numPoints;
    private double correctAnswerPoints = 0;

    public Question(String text, int numPoints) {
        Text = text;
        this.numPoints = numPoints;
    }

    // Methods
    public String displayQuestion(){
        return Text;
    }

    public double getCorrectAnswerPoints() {
        return correctAnswerPoints;
    }

    public void setCorrectAnswerPoints(double correctAnswerPoints) {
        this.correctAnswerPoints = correctAnswerPoints;
    }

    public abstract void displayAnswers();

    public abstract double scoreAnswers();


}
