public class temperature {
    
    double celsius;

    void convert(){
        double farhenheit = (celsius * (9/5)) + 32;
        System.out.println("temperature in fahrenheit = " + farhenheit);
    }

    public static void main(String[] args) {
        
        temperature obj = new temperature();

        obj.celsius = 35.5;

        obj.convert();

        
    }
}
