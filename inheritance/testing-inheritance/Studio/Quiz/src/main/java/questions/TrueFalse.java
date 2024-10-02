package questions;

public class TrueFalse extends Question {
    public TrueFalse(String question, Choice[] choiceArray) {
        super(question, choiceArray);
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return newLine + "True or False: " + newLine
                + getQuestion() + newLine + getFormattedChoices();
    }
}
