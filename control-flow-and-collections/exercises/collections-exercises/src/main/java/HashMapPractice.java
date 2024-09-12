import java.util.HashMap;
import java.util.Scanner;
import java.util.Map;

public class HashMapPractice {
    public static void main (String[] args){
        HashMap<Integer, String> students = new HashMap<>();
        Scanner input = new Scanner(System.in);
        String newStudent;
        int newID;

        System.out.println("Enter names of students (or ENTER to finish");

        do {
            System.out.println("Student: ");
            newStudent = input.nextLine();

            if (!newStudent.isEmpty()){
                System.out.println("ID: ");
                newID = input.nextInt();
                students.put(newID, newStudent);
            }

            // Read in the newline before looping back
            input.nextLine();

        }while(!newStudent.isEmpty());

        System.out.println("Class Roster: ");

        for (Map.Entry<Integer, String> student : students.entrySet()){
            System.out.println("ID: " + student.getKey() + " Name: " + student.getValue());
        }
    }
}
