package VehicleStuff;

public class Truck extends Vehicle{
    public Truck(String color, String mark, boolean isWorking) {
        super(color, mark, isWorking);
    }

    @Override
    public void run() {
        System.out.println("slooooow");
    }

    @Override
    public void getVehicleInfo() {
        super.getVehicleInfo();
    }
}
