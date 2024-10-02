package org.launchcode;

public class DVD extends BaseDisc implements OpticalDisc{

    public DVD(String name, double capacity, String contents, String discType) {
        super(name, capacity, contents, discType);
    }

    @Override
    public void spinDisc() {
        System.out.println("DVD Spinning");
    }

    @Override
    public void storeData(String data) {
        System.out.println("DVD can store 17GB");
    }

    @Override
    public void readData() {
        System.out.println("Reading movie from DVD");
    }

    @Override
    public void writeData(String data) {
        System.out.println("Writing to DVD");
    }

    @Override
    public void reportInfo() {
        System.out.println("Name: " + getName() + "Capacity: " + getCapacity() + "Content: " + getContent() + "Disc Type: " + getDiscType());
    }
}
