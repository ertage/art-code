package week1.day2.flowers;

/**
 * Created by Nastia on 23.01.17.
 */
public class Run {
    public static void main(String arg[]){
        Flower flower1 = new Flower(15, "Rose2", 100, "Low");
        Flower flower2 = new Flower(16, "Сhamomel2", 80,  "Low");
        Flower flower3 = new Flower(18, "Rose1", 200, "Hight");
        Flower flower4 = new Flower(20, "Сhamomel1", 180, "Hight");
        Flower flower5 = new Flower(15, "Rose", 140, "Medium");

        Flower[] flowers = {flower1, flower2, flower3, flower4, flower5};

        Bouquet bouquet = new Bouquet(flowers);
        bouquet.showFlowers();

        bouquet.printPrice();
        bouquet.sortFlowersByFreshness();
        bouquet.showFlowers();
        bouquet.findFlower(15);
    }
}
