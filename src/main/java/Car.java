import org.example.Vehicle;

public class Car extends Vehicle {

    public Integer km;

    public Car(String color, String mark, boolean isWorking, int km) {
        super(color, mark, isWorking);
        this.km = km;
    }

    @Override
    public void run() {
        System.out.println("brum");
    }

    @Override
    public void getVehicleInfo() {
        super.getVehicleInfo();
        System.out.println("km: "+km);
    }

}
