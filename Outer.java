public class Outer {
    int i;
    int j;

    void display(){
        System.out.println(i + j);
    }
    
    class Inner{
        void show(){
        System.out.println(i + j);
    }
}
    public static void main(String[] args){

      Outer obj = new Outer();
      obj.i=5;
      obj.j=10;
      Outer.Inner obj1 = obj.new Inner();
      obj1.show();


    }

    
}
