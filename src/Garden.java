/**
 * Created by ${SzilviaB} on 2016. 11. 21..
 */
abstract public class Garden {

    protected String name;
    protected int water;
    protected String colour;


    public Garden(String name, String colour){

        this.name = name;
        this.colour = colour;

    }

    public abstract void watering ();
}
