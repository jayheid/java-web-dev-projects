package technology;

public class SmartPhone extends Computer {
    private final String networkType;

    public SmartPhone(int year, String manufacturer, String model, boolean powerOn, String networkType) {
        super(year, manufacturer, model, powerOn);
        this.networkType = networkType;
    }

    public void makeCall(){
        System.out.println("Calling with " + networkType + " Network");
    }
}
