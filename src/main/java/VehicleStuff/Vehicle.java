package VehicleStuff;

public abstract class Vehicle {

    String color = "";
    String mark;
    boolean isWorking;

    abstract void run();


    public void getVehicleInfo() {
        System.out.println("-------------");
        System.out.println("marka: " + mark);
        System.out.println("color: " + color);
        System.out.println("isWorking: " + isWorking);

    }

    public Vehicle(String color, String mark, boolean isWorking) {
        this.color = color;
        this.mark = mark;
        this.isWorking = isWorking;
    }
}
