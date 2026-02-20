class Factorial{

    int factorial(int n){

        int fact = 1;
        
        for(int i = 1; i <= n; i++){
            fact= fact*i;
        }
        return fact;
    }

    public static void main(String[] args){

        int num=5;
        
        Factorial obj = new Factorial();

        int result = obj.factorial(num);

        System.out.println(result);
        
    }
}