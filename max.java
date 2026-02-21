public class max {

    int num1, num2, num3;

    max(int a, int b, int c){
        num1 = a;
        num2 = b;
        num3 = c;
    }
    
   void check(){

    if (num1 > num2 && num1 > num3){
        System.out.println(num1 + " is the greatest number");
    }else if(num2 > num3){
        System.out.println(num2 + " is the greatest number");
    }else
        System.out.println(num3 + " is the greatest number");
   }

   public static void main(String[] args) {
    
    max obj = new max(67,98,64);

    obj.check();
   }
}
