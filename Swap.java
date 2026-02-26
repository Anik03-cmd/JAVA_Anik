public class Swap {
    int num1, num2;

    Swap(int a, int b){

        num1 = a;
        num2 = b;

    }

    void swap(){
        int temp = num1;
        num1 = num2;
        num2 = temp;
    }

    void display(){
        System.out.println("first no.: " + num1);
        System.out.println("second no.: " + num2);
    }

    public static void main(String args[]){

        Swap obj1 = new Swap(9,4);
        
        obj1.display();
        obj1.swap();
        obj1.display();

        Swap obj2 = new Swap(78, 69);

        obj2.display();
        obj2.swap();
        obj2.display();

        

        

    }
}
