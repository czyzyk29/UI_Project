import AnimalStuff.Animal;
import AnimalStuff.Cat;
import org.junit.jupiter.api.Test;

public class AnimalTest {

    @Test
    public void AllTest(){
        Cat mialka = new Cat("Miałka");
        mialka.makeNoise();
        System.out.println(mialka.getNumberOfLegs());
        mialka.wakeUp();


    }
}
