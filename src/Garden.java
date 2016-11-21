/**
 * Created by ${SzilviaB} on 2016. 11. 21..
 */
abstract public class Garden {

    protected String name;
    protected boolean needWater;
    protected String colour;
    protected int water;

    public Garden (){

    }


    public Garden(String name, String colour, boolean needWater, int water){

        this.name = name;
        this.colour = colour;
        this.needWater = needWater;
        this.water = water;

    }

    public String getName() {
        return name;
    }

    public String getColour() {
        return colour;
    }

    public int getWater() {
        return water;
    }

    public boolean getisNeedWater() {
        return needWater;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public void setWater(int water) {
        this.water = water;
    }

    public void setNeedWater(boolean needWater) {
        this.needWater = needWater;
    }

    public static int watering(int water){
        water = water/4;

        return water;
    }



}
