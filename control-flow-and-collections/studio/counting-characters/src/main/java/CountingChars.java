import java.util.HashMap;

public class CountingChars {
    public static void main(String[] args) {
        String myString = "If the product of two terms is zero then common sense says at least one of the two terms has to be zero to start with. " +
                "So if you move all the terms over to one side, " +
                "you can put the quadratics into a form that can be factored allowing that side of the equation to equal zero. " +
                "Once you’ve done that, it’s pretty straightforward from there.";

        char[] charactersInString = myString.toCharArray();
        HashMap<Character, Integer> charCounter = new HashMap<>();

        // Get student names and grades
        for (char i : charactersInString) {

            // Check if i in charCounter key set
            if (charCounter.containsKey(i)) {
                // if yes:
                // charCounter.key(i).value += 1
//                int incrementValue = charCounter.get(i);
                charCounter.put(i, charCounter.get(i) + 1);

            } else {
                // if no:
                // create new key for i
                // value for key = 1
                charCounter.put(i, 1);

            }

        }

        System.out.println(charCounter);

    }

}
