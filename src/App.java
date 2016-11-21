/**
 * Created by ${SzilviaB} on 2016. 11. 21..
 */
public class App {

    public static void main(String[] args) {
        Flower yellowFlower = new Flower("yellow");
        Flower blueFlower = new Flower ("blue");
        Tree purpleTree = new Tree ("purple");
        Tree orangeTree = new Tree("orange");


        System.out.println("This " + yellowFlower + yellowFlower.flowerNeedsWater(yellowFlower.getWater()));
        System.out.println("This " + blueFlower + blueFlower.flowerNeedsWater());
        System.out.println("This " + purpleTree + purpleTree.treeNeedsWater());
        System.out.println("This " + orangeTree + orangeTree.treeNeedsWater());

        System.out.printf("Watering with d%", 40);
        yellowFlower.wateringFlower(Garden.watering(40));
        blueFlower.wateringFlower(Garden.watering(40));
        purpleTree.wateringTree(Garden.watering(40));
        orangeTree.wateringTree(Garden.watering(40));
        System.out.println("This " + yellowFlower + yellowFlower.flowerNeedsWater(yellowFlower.getWater()));
        System.out.println("This " + blueFlower + blueFlower.flowerNeedsWater());
        System.out.println("This " + purpleTree + purpleTree.treeNeedsWater());
        System.out.println("This " + orangeTree + orangeTree.treeNeedsWater());

        System.out.printf("Watering with d%", 70);
        yellowFlower.wateringFlower(Garden.watering(40));
        blueFlower.wateringFlower(Garden.watering(40));
        purpleTree.wateringTree(Garden.watering(40));
        orangeTree.wateringTree(Garden.watering(40));
        System.out.println("This " + yellowFlower + yellowFlower.flowerNeedsWater(yellowFlower.getWater()));
        System.out.println("This " + blueFlower + blueFlower.flowerNeedsWater());
        System.out.println("This " + purpleTree + purpleTree.treeNeedsWater());
        System.out.println("This " + orangeTree + orangeTree.treeNeedsWater());





    }

}
