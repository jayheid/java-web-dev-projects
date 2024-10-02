package org.launchcode;

public class Main {
    public static void main(String[] args) {

        // TODO: Declare and initialize a CD and a DVD object.
        CD myCd = new CD("Wish You Were Here", 700, "Music", "CD-R");
        DVD myDvd = new DVD("The Dark Knight", 4700, "Movie", "DVD-R");

        // TODO: Call each CD and DVD method to verify that they work as expected.
        myCd.spinDisc();
        myDvd.spinDisc();
        myCd.reportInfo();
        myDvd.reportInfo();
    }
}