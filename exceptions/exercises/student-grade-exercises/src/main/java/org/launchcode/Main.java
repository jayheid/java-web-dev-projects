package org.launchcode;

import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        // Test out your Divide() function!
        Divide(4,0);

        HashMap<String, String> studentFiles = new HashMap<>();
        studentFiles.put("Carl", "Program.java");
        studentFiles.put("Brad", "");
        studentFiles.put("Elizabeth", "MyCode.java");
        studentFiles.put("Stefanie", "CoolProgram.java");

        // Test out your CheckFileExtension() function!
        CheckFileExtension(studentFiles.get("Carl"));

    }

    public static void Divide(int x, int y) {
        if (y == 0) {
            try {
                throw new ArithmeticException("Can't divide by zero");
            } catch (ArithmeticException e) {
                e.printStackTrace();
            }
        } else {
            System.out.println(x / y);
        }

    }

    public static int CheckFileExtension(String fileName) {

        if(fileName.isBlank()){
            try {throw new Exception("Filename Can't be Blank");
            }catch (Exception e){
                e.printStackTrace();
                return -1;
            }
        }
        else if (fileName.contains(".java")) {
            return 1;
        }
        else{
            return 0;
        }
    }
}