package org.launchcode;

import java.util.ArrayList;

public class Menu {
    private String menuName;
    private ArrayList<MenuItem> items;

    public ArrayList<MenuItem> getItems() {

        return this.items;
    }

    public void setItems(ArrayList<MenuItem> items ) {
        this.items = items;
    }

    public void addItem(MenuItem item) {
        this.items.add(item);
    }

    public Menu(String menuName, ArrayList<MenuItem> menuItem) {
        this.menuName = menuName;
        this.items = menuItem;

    }
}