/**
 * Created by ${SzilviaB} on 2016. 11. 21..
 */
public class Flower extends Garden {


    public Flower(String colour) {
        super("Flower", colour, 0);
    }

    public boolean flowerNeedsWater() {
        if (water < 5) {
            return true;
        } else{
        return false;}
    }

    public void wateringFlower(int givenWater) {
        if (flowerNeedsWater()){
        setWater(getWater() + (int)(givenWater * 0.75));
        }
    }

    @Override
    public String toString() {
        if(flowerNeedsWater()) {
            return String.format("This %s %s needs water", colour, name);
        }
        else {
            return String.format("This %s %s doesn't need water", colour, name);
        }
    }
}
