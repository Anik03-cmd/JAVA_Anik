public class Rectangle{

    int l,b;

    void calculate(){
        System.out.println("The area of rectangle = " + (l*b));
        System.out.println("The perimeter of rectangle = " + 2*(l+b));
    }
    
    public static void main(String[] args) {
        
        Rectangle obj = new Rectangle();

        obj.l = 7;
        obj.b = 8;

        obj.calculate();
    }
}
