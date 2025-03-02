package AnimalStuff;

public class Bird implements Animal {
    @Override
    public void makeNoise() {
        System.out.println("Cwir");
    }

    @Override
    public int getNumberOfLegs() {
        return 2;
    }

    @Override
    public void sleep() {
        Animal.super.sleep();
    }

    @Override
    public void wakeUp() {
        Animal.super.wakeUp();
    }
}
