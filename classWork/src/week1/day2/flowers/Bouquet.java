package week1.day2.flowers;

/**
 * Created by Nastia on 23.01.17.
 */
public class Bouquet extends Flower{
    private Flower[] flowers;

    public Bouquet(Flower[] flowers){
        this.flowers = flowers;
    }

    public void printPrice(){
        double price = 0;
        for(int i=0; i<flowers.length; i++){
            price = price + flowers[i].getPrice();
        }
        System.out.println("Bouquet price = " + price);
    }

    public void showFlowers(){
        for(int i=0; i<flowers.length; i++){
            System.out.println(flowers[i].getName());
        }
    }

    public void sortFlowersByFreshness(){
        for(int i=0; i<flowers.length-1; i++){
            int res = flowers[i].getFreshnessLevel().compareTo(flowers[i + 1].getFreshnessLevel());
            if (res > 0) {
                Flower tmp = flowers[i];
                flowers[i] = flowers[i + 1];
                flowers[i + 1] = tmp;
            }
            if(res==0){
                for(int j=0; j<flowers.length-2; j++){
                    int newRes = flowers[j].getFreshnessLevel().compareTo(flowers[j + 2].getFreshnessLevel());
                    if (newRes > 0) {
                        Flower tmp = flowers[j];
                        flowers[j] = flowers[j + 2];
                        flowers[j + 2] = tmp;
                        i=0;
                        break;
                    }
                }
            }
        }

    }

    public void findFlower(int lenghtStalk){
        int counter = 0;
        for(int i=0; i<flowers.length-1; i++){
            if(flowers[i].getLenghtStalk() == lenghtStalk) {
                counter ++;
                flowers[i].showFlowerName();
            } 
        }
        if(counter == 0){
            System.out.println("There isn't needed flower");
        }
    }
}
