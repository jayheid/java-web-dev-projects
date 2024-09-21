package org.launchcode;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class MenuItem {
    private String name;
    private double price;
    private String category;
    private String description;
    private final LocalDate dateAdded;
    private boolean isOutOfStock;

    public MenuItem(String name, double price, String category, String description, boolean isOutOfStock) {
        this.name = name;
        this.price = price;
        this.category = category;
        this.description = description;
        this.isOutOfStock = isOutOfStock;
        this.dateAdded = LocalDate.now();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public boolean isOutOfStock() {
        return isOutOfStock;
    }

    public void setOutOfStock(boolean outOfStock) {
        isOutOfStock = outOfStock;
    }

    public LocalDate getDateAdded() {
        return dateAdded;
    }

    // Methods

    boolean isNew(){
        LocalDate today = LocalDate.now();
        double daysBetween = getDateAdded().until(today, ChronoUnit.DAYS);

        return daysBetween < 90;
    }

    // Override Special Methods
    @Override
    public String toString(){
        String newText = isNew() ? "NEW " : "";
        return newText + " " + name + " - " + description + " " + "$" + price;
    }
}
