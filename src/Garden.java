/**
 * Created by ${SzilviaB} on 2016. 11. 21..
 */
abstract public class Garden {

    protected String name;
    protected String colour;
    protected int water;

    public Garden (){

    }


    public Garden(String name, String colour, int water){

        this.name = name;
        this.colour = colour;
        this.water = water;

    }


    public static int watering(int i){

        i = i/4;
        return i;
    }

    public void setWater(int water) {
        this.water = water;
    }

    public int getWater() {
        return water;
    }


}
