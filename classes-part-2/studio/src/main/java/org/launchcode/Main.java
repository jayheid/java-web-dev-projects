package org.launchcode;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        ArrayList<MenuItem> items = new ArrayList<MenuItem>();

        MenuItem burger = new MenuItem("Burger", 5.99, "Main course", "Cheesy burger", true, false);
        items.add(burger);

        System.out.println(burger.getName());

        Menu mainCourse = new Menu("Main Course", items);

        mainCourse.get


    }
}