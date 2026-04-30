import java.util.*;

class Item {
    int code;
    double price;

    void getData(int c, double p) {
        code = c;
        price = p;
    }
}

public class ItemMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Item[] it = new Item[5];
        double total = 0;

        for (int i = 0; i < 5; i++) {
            it[i] = new Item();
            int c = sc.nextInt();
            double p = sc.nextDouble();
            it[i].getData(c, p);
            total += p;
        }

        System.out.println("Code\tPrice");
        for (int i = 0; i < 5; i++) {
            System.out.println(it[i].code + "\t" + it[i].price);
        }

        System.out.println("Total: " + total);
    }
}