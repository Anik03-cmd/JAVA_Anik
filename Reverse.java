public class Reverse {

     void reverse(int num){
        int reversenum = 0;
        while(num > 0){
        reversenum = (num % 10) + (reversenum*10);
        num = num / 10;
        }
        System.out.println(reversenum);

    }

    public static void main(String[] args) {
        
        Reverse obj = new Reverse();

        obj.reverse(345);
    }

}
