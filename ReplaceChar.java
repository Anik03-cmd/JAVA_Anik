import java.util.*;

public class ReplaceChar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        s = s.replace('d', 'f');
        System.out.println(s);
    }
}