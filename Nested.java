public class Nested {

    String message = "Hello from Outer class";

    class Inner {

        void display() {
            System.out.println("Inside Inner class");
            System.out.println(message);  
        }
    }

    public static void main(String[] args) {

        Nested obj = new Nested();              
        Nested.Inner innerObj = obj.new Inner();  

        innerObj.display();
    }
}
