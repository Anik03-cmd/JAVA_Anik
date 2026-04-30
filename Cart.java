import java.util.*;

abstract class MotorVehicle {

    String modelName;
    int modelNumber;
    float modelPrice;

    abstract void display();
}

class Cart extends MotorVehicle {

    float discountRate;

    double cal_discount() {
        return (modelPrice * discountRate) / 100;
    }

    double final_price() {
        return modelPrice - cal_discount();
    }

    void display() {
        System.out.println("Model Name : " + modelName);
        System.out.println("Model Number : " + modelNumber);
        System.out.println("Model Price : " + modelPrice);
        System.out.println("Discount : " + cal_discount());
        System.out.println("Model Price after discount : " + final_price());
    }

    public static void main(String[] args) {

        Cart c = new Cart();

        c.modelName = "Honda";
        c.modelNumber = 57547;
        c.modelPrice = 1000000;
        c.discountRate = 10;

        c.display();
    }
}

