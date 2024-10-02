package technology;

public class Laptop extends Computer{
    // Fields
    private boolean folded;

    // Constructor
    public Laptop(int year, String manufacturer, String model, boolean powerOn, boolean folded) {
        super(year, manufacturer, model, powerOn);
        this.folded = folded;
    }

    // Methods
    public void fold(){
        folded = true;
        this.setPowerOn(false); // Turn off computer
        System.out.println("Laptop is folded");
    }

    public void unfold() {
        folded = false;
        this.setPowerOn(true); // Turn on computer
        System.out.println("Laptop is unfolded");
    }

}
