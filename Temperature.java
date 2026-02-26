public class Temperature {
    
    double celsius;

    void convert(){
        double farhenheit = (celsius * (9/5)) + 32;
        System.out.println("temperature in fahrenheit = " + farhenheit);
    }

    public static void main(String[] args) {
        
        Temperature obj = new Temperature();

        obj.celsius = 35.5;

        obj.convert();

        
    }
}
