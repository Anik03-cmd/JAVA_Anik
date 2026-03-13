public class Overloading{

    int area(int l, int b){
        return (l*b);
    }

    int area(int r){
        return (int) (3.14*r*r);
    }

    
    public static void main(String args[]){

       Overloading obj = new Overloading();
       System.out.println("Area of rectangle:"+obj.area(10,20));
       System.out.println("Area of rectangle:"+obj.area(5));

               
    }
}