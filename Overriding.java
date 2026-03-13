class A{

    void show(){
        System.out.println("my name is anik");
    }
}
class B extends A{

    void show(){
        System.out.println("my name is akash");
    }
}

public class Overriding{

    public static void main(String args[]){

        B obj = new B();

        obj.show();

    }
}
    

