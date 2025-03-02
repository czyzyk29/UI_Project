package AnimalStuff;

public interface Animal {

    void makeNoise();

    int getNumberOfLegs();

    default void sleep(){
        System.out.println("ZZZZ");
    };

    default void wakeUp(){
        System.out.println("wake up");
    }

}
