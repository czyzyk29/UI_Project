package org.example;

public class Bicicle extends Vehicle{

    public void ringBell(){
        System.out.println("dyn");
    }

    @Override
    public void run() {
        System.out.println("pedałuje");
    }

    public Bicicle(String color, String mark, boolean isWorking) {
        super(color, mark, isWorking);
    }
}
