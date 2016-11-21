/**
 * Created by ${SzilviaB} on 2016. 11. 21..
 */
public class App {

    public static void main(String[] args) {
        Flower yellowFlower = new Flower("yellow");
        Flower blueFlower = new Flower ("blue");
        Tree purpleTree = new Tree ("purple");
        Tree orangeTree = new Tree("orange");


        System.out.println(yellowFlower.toString());
        System.out.println(blueFlower.toString());
        System.out.println(purpleTree.toString());
        System.out.println(orangeTree.toString() + "\n");


        System.out.printf("Watering with %d \n", 40);
        yellowFlower.wateringFlower(Garden.watering(40));
        blueFlower.wateringFlower(Garden.watering(40));
        purpleTree.wateringTree(Garden.watering(40));
        orangeTree.wateringTree(Garden.watering(40));

        System.out.println(yellowFlower.toString());
        System.out.println(blueFlower.toString());
        System.out.println(purpleTree.toString());
        System.out.println(orangeTree.toString() + "\n");


        System.out.printf("Watering with %d \n", 70);
        yellowFlower.wateringFlower(Garden.watering(70));
        blueFlower.wateringFlower(Garden.watering(70));
        purpleTree.wateringTree(Garden.watering(70));
        orangeTree.wateringTree(Garden.watering(70));

        System.out.println(yellowFlower.toString());
        System.out.println(blueFlower.toString());
        System.out.println(purpleTree.toString());
        System.out.println(orangeTree.toString() + "\n");




    }

}
