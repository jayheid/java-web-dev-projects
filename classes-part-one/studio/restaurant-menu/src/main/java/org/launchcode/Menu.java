package org.launchcode;

import java.time.LocalDate;
import java.util.ArrayList;

public class Menu {
    private String menuName;
    private ArrayList<MenuItem> menuItems = new ArrayList<>();
    private LocalDate lastUpdated;

    public String getMenuName() {
        return menuName;
    }

    public void setMenuName(String menuName) {
        this.menuName = menuName;
    }

    public ArrayList<MenuItem> getItems() {
        return menuItems;
    }

    public LocalDate getLastUpdated() {
        return lastUpdated;
    }

    // Instance Methods
    void addItem(MenuItem newItem){
        menuItems.add(newItem);
        updateMenu();
    }

    void removeItem(MenuItem item){
        menuItems.remove(item);
        updateMenu();
    }

    void updateMenu(){
        lastUpdated = LocalDate.now();
    }

    // Special Methods
    @Override
    public String toString(){
        StringBuilder appetizers = new StringBuilder();
        for (MenuItem item: menuItems){
            if (item.getCategory().equals("Appetizers")){
                appetizers.append("\n").append(item.toString()).append("\n");
            }
        }

        StringBuilder mainCourse = new StringBuilder();
        for (MenuItem item: menuItems){
            if (item.getCategory().equals("Main Course")){
                mainCourse.append("\n").append(item.toString()).append("\n");
            }
        }

        StringBuilder desserts = new StringBuilder();
        for (MenuItem item: menuItems){
            if (item.getCategory().equals("Dessert")){
                desserts.append("\n").append(item.toString()).append("\n");
            }
        }

        return "\nJake's Place\n" +
                "Appetizers: " + appetizers.toString() + "\n" +
                "Main Courses: " + mainCourse.toString() + "\n" +
                "Desserts: " + desserts.toString();
    }

}