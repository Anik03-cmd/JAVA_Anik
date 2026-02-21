public class factorial {
    
    int Factorial(int n){

         int i;
         int fact = 1;

         for(i = 1; i <= n; i++){

            fact = fact * i;

         }

         return fact;
    }

    public static void main(String[] args) {
        
        factorial obj = new factorial();

        int result = obj.Factorial(5);

        System.out.println(result);
    }
}
