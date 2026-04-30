package .vscode;
import java.util.*;

abstract class abstractProduct{
    int product_id;
    String name, description;
} 

class Product extends abstractProduct{

    int product_id;
    double price;

}

class Book extends Product{

    int product_id;
    String Author, Title;

}

class CompactDisc extends Product{

    int product_id;
    String Artist, Title;

}

public class TravelGuide extends Book{

    
    
}
