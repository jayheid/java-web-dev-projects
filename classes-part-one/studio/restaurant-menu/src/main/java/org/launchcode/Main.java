package org.launchcode;

public class Main {

    public static void main(String[] args) {

        MenuItem burger = new MenuItem("Burger", 5.99, "Main Course", "Cheesy burger", true);
        MenuItem pizza = new MenuItem("Pizza", 10.99, "Main Course", "Sausage pizza", false);
        MenuItem frozenCustard = new MenuItem("Cardinal Sin Concrete", 3.89, "Dessert", "Frozen Custard with Hot Fudge and Bitter Cherries", false);
        MenuItem hotWings = new MenuItem("Hot Wings", 8.00, "Appetizers", "Dry rub wings. Served with honey mustard or ranch.", false);

        Menu menu = new Menu();

        menu.addItem(burger);
        menu.addItem(pizza);
        menu.addItem(frozenCustard);
        menu.addItem(hotWings);

        System.out.println(menu);



    }
}