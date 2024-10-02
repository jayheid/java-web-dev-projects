package questions;

import java.util.ArrayList;

public class Checkbox extends Question {
    public Checkbox(String question, Choice[] choiceArray) {
        super(question, choiceArray);
        setMaxResponses(getNumCorrect());
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return newLine + "Choose all that apply: " + newLine
                + getQuestion() + newLine + getFormattedChoices();
    }

    public int getNumCorrect(){
        int numCorrect = 0;
        for (Choice choice : getChoiceMap().values()){
            if (choice.isCorrect()){
                numCorrect++;
            }
        }
        return numCorrect;
    }
}
