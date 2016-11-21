/**
 * Created by ${SzilviaB} on 2016. 11. 21..
 */
public class Tree extends Garden {

    public Tree(String colour){
        super("Tree", colour, true, 0);
    }


    public void treeNeedsWater(int water) {
        if (water < 10) {
            System.out.println("needs water");
        }

        else {
            super.setNeedWater(false);
            System.out.println("doesn't need water");
        }
    }


    public double wateringTree(int water) {
        double waterD = (double) water * 0.4;
        return water + waterD;
    }

}
