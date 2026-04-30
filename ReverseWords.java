import java.util.*;

public class ReverseWords {
    public static void main(String[] args) {
        String s = String.join(" ", args);
        String[] arr = s.split(" ");

        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }
    }
}