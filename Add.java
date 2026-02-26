public class Add {

    int a,b;

    void sum(){
        System.out.println("the sum of a and b is: " + (a+b));
    }
    
    public static void main(String args[]){
        
        Add obj = new Add();

        obj.a = 10;
        obj.b = 20;

        obj.sum();
    }
}
