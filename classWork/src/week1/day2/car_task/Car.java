package week1.day2.car_task;

/**
 * Created by anastasiia.shvetsova on 1/23/2017.
 */
public class Car {
    private Engine engine;
    private Wheel[] wheels;
    private String model;

    public Car(Engine engine, Wheel[] wheels, String model){
        this.engine = engine;
        this.wheels = wheels;
        this.model = model;
    }

    public boolean go(){
        boolean go = true;
        if(engine.getState() == false){
            System.out.println("Sorry! You can't go! You should turn on your engine");
            go = false;
        }
        if(engine.getPetrol() == 0){
            System.out.println("Sorry! You can't go! You don't have petrol enough. You should get some petrol");
            go = false;
        }
        if(wheels.length < 4){
            System.out.println("Sorry! You can't go! Maybe your wheel is broken");
            go = false;
        }
        if(go){
            System.out.println("good luck");
        }
        return  go;
    }

    public void getPetrol(int petrol){
        engine.setPetrol(petrol);
    }
    public void turnOnEngine(){
        engine.setState(true);
    }

    public String showCarModel(){
        return String.format("Car model - %s", model);
    }
}
