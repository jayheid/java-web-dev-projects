package questions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

public abstract class Question {
    // Fields
    private final String question;
    private final HashMap<Integer, Choice> choiceMap = new HashMap<>();
    private int maxResponses = 1;

    public Question (String question, Choice[] choiceArray){
        this.question = question;
        createRandomizedChoiceMap(choiceArray);

    }

    // Methods
    public String getQuestion() {
        return question;
    }

    public HashMap<Integer, Choice> getChoiceMap() {
        return choiceMap;
    }

    public int getMaxResponses() {
        return maxResponses;
    }

    public void setMaxResponses(int maxResponses) {
        this.maxResponses = maxResponses;
    }

    // Override method
    // Abstract method used as toString output will be different for each subclass
    @Override
    public abstract String toString();

    // Instance Methods
    void createRandomizedChoiceMap(Choice[] choiceArray){
        ArrayList<Choice> choiceList = new ArrayList<>();
        Collections.addAll(choiceList, choiceArray); // adding items from choiceArray to choiceList
        Collections.shuffle(choiceList); // shuffling items in choiceArray - want random selection
        for (int i = 0; i < choiceList.size(); i++){
            choiceMap.put(i+1, choiceList.get(i));
        }
    }

    String getFormattedChoices(){
        StringBuilder formattedChoices = new StringBuilder();
        String newLine = System.lineSeparator();
        for (int choiceNum : choiceMap.keySet()){
            String choice  = "\t" + choiceNum + " - " + choiceMap.get(choiceNum).getContent() + newLine;
            formattedChoices.append(choice);
        }
        return formattedChoices.toString();
    }

    public boolean isInvalid(String response){
        try{
            int responseInt = Integer.parseInt(response);
            return responseInt < 0 || responseInt > choiceMap.size();
        }catch (NumberFormatException e){
            return true;
        }
    }


}
