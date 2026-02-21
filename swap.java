public class swap {
    int num1, num2;

    swap(int a, int b){

        num1 = a;
        num2 = b;

    }

    void Swap(){
        int temp = num1;
        num1 = num2;
        num2 = temp;
    }

    void display(){
        System.out.println("first no.: " + num1);
        System.out.println("second no.: " + num2);
    }

    public static void main(String args[]){

        swap obj1 = new swap(9,4);
        
        obj1.display();
        obj1.Swap();
        obj1.display();

        swap obj2 = new swap(78, 69);

        obj2.display();
        obj2.Swap();
        obj2.display();

        

        

    }
}
