package functionalInterfaces.moreFunctionalInterface;

import java.util.function.DoubleSupplier;

public class DoubleSupply {
    public static void main(String[] args) {
        DoubleSupplier doubleSupplier = Math::random;
        System.out.println(doubleSupplier.getAsDouble());


    }
}
