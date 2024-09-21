package org.launchcode;

public class MenuItem {
    private String name;
    private double price;

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

    public boolean isNew() {
        return isNew;
    }

    public void setNew(boolean aNew) {
        isNew = aNew;
    }

    public boolean isOutOfStock() {
        return isOutOfStock;
    }

    public void setOutOfStock(boolean outOfStock) {
        isOutOfStock = outOfStock;
    }

    private String category;
    private String description;
    private boolean isNew;
    private boolean isOutOfStock;

    public MenuItem(String name, double price, String category, String description, boolean isNew,
                    boolean isOutOfStock) {
        this.name = name;
        this.price = price;
        this.category = category;
        this.description = description;
        this.isNew = isNew;
        this.isOutOfStock = isOutOfStock;
    }
}