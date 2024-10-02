import questions.Question;
import questions.Choice;

import java.awt.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Quiz {
    private final ArrayList<Question> questions = new ArrayList<>();
    private int numCorrect = 0;

    public ArrayList<Question> getQuestions() {
        return questions;
    }

    public int getNumCorrect() {
        return numCorrect;
    }

    public void addQuestions(Question[] questionArray){
        Collections.addAll(questions, questionArray);
    }

    public void run(){
        Scanner input = new Scanner(System.in);
        Collections.shuffle(questions);

        // Loop through each question
        for (Question question: questions){
            // Print question for user
            System.out.println(question);

            // Get and evaluate response
            ArrayList<Integer> userResponses = new ArrayList<>();
            int i = 0;
            while (i < question.getMaxResponses()){
                String userResponse;

                // Validate response
                do {
                    System.out.println("Please enter a number: ");
                    userResponse = input.nextLine();
                }while (question.isInvalid(userResponse));

                // Evaluate Response
                int userResponseNum = Integer.parseInt(userResponse);
                if (userResponses.contains(userResponseNum)){
                    System.out.println("You already submitted this answer.");
                }else if (!question.getChoiceMap().get(userResponseNum).isCorrect()) {
                    System.out.println("Incorrect.");
                    System.out.println("Correct Answer: ");
                    for (Choice choice: question.getChoiceMap().values()){
                        if (choice.isCorrect()){
                            System.out.println(choice.getContent());
                        }
                    }
                    break;
                }else{
                    System.out.println("Correct!");
                    userResponses.add(userResponseNum);
                    // Check if on last response
                    if (i == question.getMaxResponses() -1) {
                        numCorrect++;
                    }
                    i++;
                }

            }
        }
        input.close();
    }
}
