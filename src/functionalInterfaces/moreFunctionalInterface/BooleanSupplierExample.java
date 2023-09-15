package functionalInterfaces.moreFunctionalInterface;

import java.util.function.BooleanSupplier;

public class BooleanSupplierExample {
    public static void main(String[] args) {
        BooleanSupplier booleanSupplier1 = ()-> true;
        BooleanSupplier booleanSupplier2 = ()-> "Man".equals("Woman");
        BooleanSupplier booleanSupplier3 = ()->"123".contains("124");
        BooleanSupplier booleanSupplier4 = ()-> "".isEmpty();


        System.out.println(booleanSupplier1.getAsBoolean());
        System.out.println(booleanSupplier2.getAsBoolean());
        System.out.println(booleanSupplier3.getAsBoolean());
        System.out.println(booleanSupplier4.getAsBoolean());
    }
}
