public class Numcheck {

    int n;

    Numcheck(int i){
        n = i;
    }
    
    void check(){

        if(n < 0){
            System.out.println(n + " is a negative number");
        }else if(n > 0){
            System.out.println(n + " is a positive number");
        }else
            System.out.println("invalid number");    
    }
    public static void main(String args[]){

        Numcheck obj = new Numcheck(8);

        obj.check();
    }
}
