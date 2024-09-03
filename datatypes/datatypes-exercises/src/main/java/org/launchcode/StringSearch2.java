package org.launchcode;

import java.util.Scanner;

public class StringSearch2 {
    public static void main (String[] args){
        String alice = "Alice was beginning to get very tired of sitting by her sister on the bank, " +
                "and of having nothing to do: once or twice she had peeped into the book her sister was reading, " +
                "but it had no pictures or conversations in it, ‘and what is the use of a book,’ " +
                "thought Alice ‘without pictures or conversation?’";
        Scanner input;
        String searchItem;
        int searchItemIndex;
        String newAlice;

        input = new Scanner(System.in);

        System.out.println("Specify a term to search: ");
        searchItem = input.nextLine();

        searchItemIndex = alice.indexOf(searchItem);
        System.out.println("Index of search term: " + searchItemIndex);

        newAlice = alice.replace(searchItem, "");
        System.out.println(newAlice);
    }
}
