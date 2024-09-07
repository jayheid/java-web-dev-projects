import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class ArrayListPractice {
    public static void main (String[] args){
        ArrayList<Integer> newArrayList = new ArrayList<Integer>();
        ArrayList<String> newStringArray = new ArrayList<String>();
        int sum;
        Scanner input = new Scanner(System.in);
        int searchLength;
        String newString = "I would not, could not, in a box. " +
                "I would not, could not with a fox. " +
                "I will not eat them in a house. " +
                "I will not eat them with a mouse.";
        ArrayList<String> newStringArrayList = new ArrayList<String>(Arrays.asList(newString.split(" ")));

        newArrayList.add(1);
        newArrayList.add(2);
        newArrayList.add(3);
        newArrayList.add(4);
        newArrayList.add(5);
        newArrayList.add(6);
        newArrayList.add(7);
        newArrayList.add(8);
        newArrayList.add(9);
        newArrayList.add(10);

        sum = totalSum(newArrayList);

        System.out.print("Final Sum: " + sum);

        newStringArray.add("Jacob");
        newStringArray.add("Michael");
        newStringArray.add("Jonas");
        newStringArray.add("Rachel");
        newStringArray.add("Stephanie");


        System.out.println(newStringArrayList);

        System.out.println("Specify number of letters each word should have for return: ");
        searchLength = input.nextInt();
        System.out.println(CharacterLengthSearch(newStringArrayList, searchLength));

    }
    public static int totalSum(ArrayList <Integer> arr){
        int sum = 0;
        for (int i : arr){
            sum+=i;
        }
        return sum;
    }

    public static String CharacterLengthSearch(ArrayList <String> arr, int searchLength){
        ArrayList<String> returnArrayList = new ArrayList<String>();
        for (String i : arr){
            if (i.length() == searchLength){
                returnArrayList.add(i);
            }
        }
        return returnArrayList.toString();
    }
}
