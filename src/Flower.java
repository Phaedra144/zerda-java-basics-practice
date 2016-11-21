/**
 * Created by ${SzilviaB} on 2016. 11. 21..
 */
public class Flower extends Garden {


    public Flower(String colour){
        super("Flower", colour, true, 0);
    }


    public void flowerNeedsWater(int water) {
        if (water < 5) {
            System.out.println("needs water");
        }
        else
            super.setNeedWater(false);
            System.out.println("doesn't need water");
    }

    public double wateringFlower(int water) {
        double waterD = (double) water * 0.75;
        return water + waterD;
    }
}
