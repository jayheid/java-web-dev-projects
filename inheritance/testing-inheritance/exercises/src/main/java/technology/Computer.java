package technology;

public class Computer {
    private int year;
    private String manufacturer;
    private String model;
    private boolean powerOn = false;

    public Computer(int year, String manufacturer, String model, boolean powerOn) {
        this.year = year;
        this.manufacturer = manufacturer;
        this.model = model;
        this.powerOn = powerOn;
    }

    // Getters and Setters


    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public boolean isPowerOn() {
        return powerOn;
    }

    public void setPowerOn(boolean powerOn) {
        this.powerOn = powerOn;
    }

    // Methods
    public void turnOn(){
        powerOn = true;
        System.out.println("Computer is On");
    }

    public void turnOff(){
        powerOn = false;
        System.out.println("Computer is Off");
    }

}
