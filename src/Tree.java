/**
 * Created by ${SzilviaB} on 2016. 11. 21..
 */
public class Tree extends Garden {

    public Tree(String colour){
        super("Tree", colour, 0);
    }


    public boolean treeNeedsWater() {
        if (water < 10) {
            return true;
        } else{
            return false;}
    }

    public void wateringTree(int givenWater) {
        if (treeNeedsWater()){
            setWater(getWater() + (int)(givenWater * 0.4));
        }
    }

    @Override
    public String toString() {
        if(treeNeedsWater()) {
            return String.format("This %s %s needs water", colour, name);
        }
        else {
            return String.format("This %s %s doesn't need water", colour, name);
        }
    }



}
