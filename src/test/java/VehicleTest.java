import VehicleStuff.Bicicle;
import VehicleStuff.Car;
import VehicleStuff.Truck;
import org.junit.jupiter.api.Test;

public class VehicleTest {


    @Test
    void additionTest() {

        Car audi = new Car("Red","Audi",true,1000);
        audi.getVehicleInfo();
        audi.run();

        Car bmw = new Car("Blue","BMW",false,100000);
        bmw.getVehicleInfo();
        bmw.run();

        Bicicle romet = new Bicicle("Blue","romet",false);

        romet.getVehicleInfo();
        romet.run();
        romet.ringBell();

        Truck man = new Truck("black","MAN",true);
        man.getVehicleInfo();
        man.run();

    }


}
