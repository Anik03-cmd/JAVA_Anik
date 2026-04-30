import java.util.*;

public class StringStats {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        int up = 0, low = 0, dig = 0, sp = 0;

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if (Character.isUpperCase(c)) up++;
            else if (Character.isLowerCase(c)) low++;
            else if (Character.isDigit(c)) dig++;
            else if (c == ' ') sp++;
        }

        System.out.println("Uppercase: " + up);
        System.out.println("Lowercase: " + low);
        System.out.println("Digits: " + dig);
        System.out.println("Spaces: " + sp);
    }
}
