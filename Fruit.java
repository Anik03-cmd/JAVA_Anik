import java.util.*;

interface Mango {
    void taste();
}

class Winter implements Mango {
    public void taste() {
        System.out.println("Less sweet mango in winter");
    }
}

class Summer implements Mango {
    public void taste() {
        System.out.println("Sweet mango in summer");
    }
}

public class Fruit{
    public static void main(String[] args) {
        Mango m1 = new Winter();
        Mango m2 = new Summer();

        m1.taste();
        m2.taste();
    }
}