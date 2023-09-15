package functionalInterfaces;

import java.math.BigDecimal;

public class Account {
    public static boolean withdraw(BigDecimal amount ){
        if (amount.compareTo(BigDecimal.valueOf(0))<0){
            throw new RuntimeException("Insufficient balance"){

            };

        }
        return true;
    }
}
