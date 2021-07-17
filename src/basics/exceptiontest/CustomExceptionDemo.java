package basics.exceptiontest;

import java.util.HashMap;
import java.util.Map;

/**
 * Java Program to create custom exception and examples to show how to use
 * custom exception in Java.
 *
 * @author Javin Paul
 */
public class CustomExceptionDemo {

    private static final Map<Integer, String> products = new HashMap<>();

    static {
        products.put(100, "Coke");
        products.put(101, "KitKat");
        products.put(102, "Bisuits");
        products.put(103, "Toast");
    }

    public static void main(String args[]) {
        CustomExceptionDemo t = new CustomExceptionDemo();
        t.getProduct(1000);
    }

    public String getProduct(int id) {
        if (products.get(id) == null) {
            throw new NoSuchProductException("No such product exists", id);
        }
        return products.get(id);
    }
}


