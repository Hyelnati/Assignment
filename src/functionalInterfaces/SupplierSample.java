package functionalInterfaces;

import java.util.function.Supplier;

public class SupplierSample {
    public static void main(String[] args) {
        Supplier<String> supplier = ()-> "Supplier returns something unlike the consumer";

        System.out.println(supplier.get());
    }
}
