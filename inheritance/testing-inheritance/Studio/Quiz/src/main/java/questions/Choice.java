package questions;

public class Choice {
    // Fields
    private final String content;
    private final boolean correct;

    // Constructor
    public Choice(String content, boolean correct) {
        this.content = content;
        this.correct = correct;
    }

    public Choice(String content) {
        this(content, false);
    }

    // Getters
    public String getContent() {
        return content;
    }

    public boolean isCorrect() {
        return correct;
    }
}
