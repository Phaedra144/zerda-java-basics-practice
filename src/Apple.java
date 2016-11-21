/**
 * Created by ${SzilviaB} on 2016. 11. 21..
 */
public class Apple {
    public Apple() {
        System.out.println("Apple is created");
    }
}

class Blackberry extends Apple {
    public Blackberry() {
        System.out.println("Blackberry is created");
    }

    public static int getNumber() {
        return 4;
    }
}

class Main {
    public static void main(String... args) {
        Blackberry b = new Blackberry();
        System.out.println(Blackberry.getNumber());
    }
}


