package checkOutAppTest;

import checkOutApp.Product;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CustomerTest {
    Customer customer = new Customer();
    Product product;
    @BeforeEach
    public void startWith(){

    }

    @Test
    public void customerCanAddProductTest(){
        customer.placeOrder("Onion", 4,5.7);
        assertEquals(1, customer.size());
    }
    @Test public void customerCanAddMoreProductsTest(){
        customer.placeOrder("Onion", 4,5.7);
        customer.placeOrder("Beans",2,9.0);
        customer.placeOrder("Rice",2,9.9);
        assertEquals(3, customer.size());
    }

}
