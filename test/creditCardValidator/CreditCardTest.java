package creditCardValidator;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


class CreditCardTest {

    @Test
    public void validateCardNumberLengthTest(){
        CreditCard creditCard = new CreditCard();
        Assertions.assertEquals("Invalid Card Number", creditCard.validateCardNumberLength("7827878257782574422442"));
        Assertions.assertEquals("Card Number Correct", creditCard.validateCardNumberLength("46343774636463"));
    }

    @Test
    public void ValidateCardTypeTest(){
        CreditCard creditCard = new CreditCard();
        Assertions.assertEquals(creditCard.checkCardType("54383827473732"), "Master Card");
        Assertions.assertEquals(creditCard.checkCardType("64383827473732"), "Discover Card");
        Assertions.assertEquals(creditCard.checkCardType("37383827473732"), "American Express");
        Assertions.assertEquals(creditCard.checkCardType("97383827473732"), "Invalid Card Type");
        Assertions.assertEquals(creditCard.returnCardNumber("72424874274278742"), "72424874274278742");
    }

    @Test
    public void CardStatusTest(){
        CreditCard creditCard = new CreditCard();
        Assertions.assertEquals("Invalid", creditCard.cardValidityStatus("4388576018402626"));
        Assertions.assertEquals("Valid", creditCard.cardValidityStatus("4388576018410707"));
    }

    @Test
    public void cardNumberLengthLength(){
        CreditCard creditCard = new CreditCard();
        Assertions.assertEquals(15, creditCard.cardNumberLength("374626363636363"));
    }
}

