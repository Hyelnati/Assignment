package creditCardValidator;

import java.util.Objects;

public class CreditCard {

    public String validateCardNumberLength(String cardNumber){
        String[] cardNumbers = cardNumber.split("");
        if (cardNumbers.length < 13 || cardNumbers.length > 16){
            return "Invalid Card Number";
        }
        return "Card Number Valid";
    }

    public String checkCardType(String cardNumber){
        String[] cardNumbers = cardNumber.split("");
        if (Objects.equals(cardNumbers[0], "4")) {
            return "Visa Cards";
        }
        if (Objects.equals(cardNumbers[0], "5")){
            return "Master Cards";
        }
        if (Objects.equals(cardNumbers[0], "3") && Objects.equals(cardNumbers[1], "7")){
            return "American Express Cards";
        }
        if (Objects.equals(cardNumbers[0], "6")){
            return "Discover Cards";
        }
        return "Invalid Card Type";
    }

    public String returnCardNumber(String cardNumber){
        return cardNumber;
    }

    public String cardValidityStatus(String cardNumber){
        String[] cardNumbers = cardNumber.split("");
        int sumOfSingleDigitNumber = 0;
        for (int index = cardNumber.length()-2; index >= 0; index-=2) {
            if ((Integer.parseInt( cardNumbers[index]) * 2) > 9) {
                sumOfSingleDigitNumber += ((Integer.parseInt(cardNumbers[index]) * 2) % 10) + 1;
            }
            else
                sumOfSingleDigitNumber += Integer.parseInt(cardNumbers[index]) * 2;
        }
        int sumOfOddDigit = 0;
        for (int index = cardNumbers.length-1; index >= 0; index-=2) {
            sumOfOddDigit+= Integer.parseInt(cardNumbers[index]);
        }
        System.out.println(sumOfOddDigit);
        System.out.println(sumOfSingleDigitNumber);
        int totalSum = sumOfOddDigit+sumOfSingleDigitNumber;
        System.out.println(totalSum);
        if (totalSum % 10 == 0){
            return "Valid";
        }
        return "Invalid";
    }

    public int cardNumberLength(String cardNumber){
        return cardNumber.length();
    }
}


