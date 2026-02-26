public class OddEven {


    void check(int n){

        if(n % 2 == 0){
            System.out.println("even");
        }else
            System.out.println("odd");

    }

    public static void main(String[] args) {
        
        OddEven obj = new OddEven();

        obj.check(16);
    }
           
}
