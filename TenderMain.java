import java.util.*;

class Tender {
    double cost;
    String name;

    void getData(String n, double c) {
        name = n;
        cost = c;
    }
}

public class TenderMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Tender[] t = new Tender[5];

        for (int i = 0; i < 5; i++) {
            t[i] = new Tender();
            String n = sc.next();
            double c = sc.nextDouble();
            t[i].getData(n, c);
        }

        double min = t[0].cost;
        String cname = t[0].name;

        for (int i = 1; i < 5; i++) {
            if (t[i].cost < min) {
                min = t[i].cost;
                cname = t[i].name;
            }
        }

        System.out.println(cname);
    }
}