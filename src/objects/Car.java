package objects;

import java.util.Random;

public class Car implements Runnable{
    Random rand = new Random();
    private String name;
    private int speed;
    private final static int destination = 300;
    private int acceleration;

    public Car(String name, int speed, int acceleration) {
        this.name = name;
        this.speed = speed;
        this.acceleration = acceleration;

    }

    @Override
    public void run() {
        int sum = 0;
        while (sum <= destination){
            sum += speed;
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            speed += acceleration;
        }
        System.out.println(this.name + " Finished :)");
    }
}
