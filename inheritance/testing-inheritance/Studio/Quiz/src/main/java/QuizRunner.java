import questions.Checkbox;
import questions.Choice;
import questions.Question;

public class QuizRunner {
    private static final Quiz quiz = new Quiz();

    public static void main(String[] args){
        // Add Questions
        String q1 = "Which of the following are books by Mark Twain?";
        Choice[] q1Choices = new Choice[]{
                new Choice("Huckleberry Finn", true),
                new Choice("Madame Bovary"),
                new Choice("Letters From the Earth", true),
                new Choice("Tom Sawyer", true)
        };

        Checkbox question1 = new Checkbox(q1, q1Choices);

        // Add Questions to Quiz
        quiz.addQuestions(new Question[] {question1});


        // Interact with User
        quiz.run();

        // Provide score
        String newLine = System.lineSeparator();
        System.out.println(newLine + "You answered " + quiz.getNumCorrect() + " of " + quiz.getQuestions().size() + " questions correctly." + newLine);
    }

}
