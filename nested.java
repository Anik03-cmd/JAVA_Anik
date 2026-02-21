public class nested {

    String message = "Hello from Outer class";

    class Inner {

        void display() {
            System.out.println("Inside Inner class");
            System.out.println(message);  
        }
    }

    public static void main(String[] args) {

        nested obj = new nested();              
        nested.Inner innerObj = obj.new Inner();  

        innerObj.display();
    }
}
