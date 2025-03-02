package AnimalStuff;

public class Cat implements Animal, Mammal {
    String name;

    public Cat(String name) {
        this.name = name;
    }


    @Override
    public void makeNoise() {
        System.out.println("meow");
    }

    @Override
    public int getNumberOfLegs() {
        return 4;
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
