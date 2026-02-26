public class Leap {
    
    void check(int year){
        if(year  % 400 == 0 || year % 100 != 0 && year % 4 == 0){
            System.out.println("leap year");
        }else
            System.out.println("not a leap year");
    }

    public static void main(String[] args) {
        
        Leap obj = new Leap();

        obj.check(1900);
    }
}
