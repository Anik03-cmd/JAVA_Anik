import java.util.*;

public class CaseChange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String res = "";

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if (Character.isLowerCase(c))
                res += Character.toUpperCase(c);
            else if (Character.isUpperCase(c))
                res += Character.toLowerCase(c);
            else
                res += c;
        }

        System.out.println(res);
    }
}
