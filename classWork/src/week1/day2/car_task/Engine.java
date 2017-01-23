package week1.day2.car_task;

/**
 * Created by anastasiia.shvetsova on 1/23/2017.
 */
public class Engine {
   private int power;
   private int weight;
   private String type;
   private int petrol;
   private boolean state;

   public Engine(int power, int weight, String type, int petrol, boolean state){
       this.power = power;
       this.weight = weight;
       this.type = type;
       this.petrol = petrol;
       this.state = state;
   }

    public int getPetrol() {
        return petrol;
    }

    public void setPetrol(int petrol){
       this.petrol = petrol;
    }

    public boolean getState(){
        return state;
    }

    public void  setState(boolean state){
        this.state = state;
    }
}
