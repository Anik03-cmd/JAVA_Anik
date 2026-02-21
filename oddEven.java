public class oddEven {


    void check(int n){

        if(n % 2 == 0){
            System.out.println("even");
        }else
            System.out.println("odd");

    }

    public static void main(String[] args) {
        
        oddEven obj = new oddEven();

        obj.check(16);
    }
           
}
