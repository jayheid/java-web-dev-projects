package org.launchcode;

public interface OpticalDisc {
    String MY_DISC = "My Disc";
    String SHAPE = "Round";

    void spinDisc();
    void storeData(String data);
    void readData();
    void writeData(String data);
    void reportInfo();
}