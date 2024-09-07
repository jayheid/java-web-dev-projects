import java.util.Arrays;

public class ArrayPractice {
    public static void main (String[] args){
        int[] newArray = {1,1,2,3,5,8};
        String newString = "I would not, could not, in a box. " +
                "I would not, could not with a fox. " +
                "I will not eat them in a house. " +
                "I will not eat them with a mouse.";
        String[] stringArray;
        for (int i : newArray) {
            System.out.println(i);
        }

        stringArray = newString.split("\\.");

        for (String i : stringArray){
            System.out.println(i);
        }
    }
}
