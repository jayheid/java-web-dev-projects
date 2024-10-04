package org.launchcode;

abstract class BaseDisc{
    private String name;
    private double capacity;
    private String content;
    private String discType;

    public BaseDisc(String name, double capacity, String contents, String discType) {
        this.name = name;
        this.capacity = capacity;
        this.content = contents;
        this.discType = discType;
    }

    public String getDiscType() {
        return discType;
    }
    public void setDiscType(String discType) {
        this.discType = discType;
    }
    public String getContent() {
        return content;
    }
    public void setContent(String content) {
        this.content = content;
    }
    public double getCapacity() {
        return capacity;
    }
    public void setCapacity(double capacity) {
        this.capacity = capacity;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
}
