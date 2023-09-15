package checkOutApp;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static jdk.internal.org.jline.keymap.KeyMap.display;

public class Store {
   Scanner input = new Scanner(System.in);
    private List<String> products = new ArrayList<>();
    private List<Integer>quantities = new ArrayList<>() ;
    private List<Double> productPrices = new ArrayList<>();
    private static String cashierName;
    private static String customerName;
    private double subTotal;
    private double discount;
    double tax;
    double amountPaid;
    double balance;
    private static LocalDateTime currentDateTime = LocalDateTime.now();


    private void customerDetails(){
       System.out.println("What is the customers name: ");
       customerName = input.nextLine();
    }
    private void cashierDetails(){
        System.out.println(("Cashier's name: "));
        cashierName = input.next();
        System.out.println(("How much discount will he get? "));
        discount = input.nextDouble();

    }
    private void customersOrder(){
        System.out.println(("What did the customer buy? "));
        String productName = input.next();
        products.add(productName);

        System.out.println(("How many pieces ?"));
        int quantity = input.nextInt();
        quantities.add(quantity);

        System.out.println(("How much per unit? "));
        double price = input.nextDouble();
        productPrices.add(price);


        System.out.println(("Add more items? "));
        String question = input.next();
        if (question.equalsIgnoreCase("yes")){
            customersOrder();
        }
        else cashierDetails();
    }

    public LocalDateTime getCurrentDateTime() {
        return currentDateTime;
    }

    public void setCurrentDateTime(LocalDateTime currentDateTime) {
        this.currentDateTime = currentDateTime;
    }

    public void printInvoice(){
        dashFormat();
        System.out.println();
        System.out.printf("""
                SEMICOLON STORES
                MAIN BRANCH
                LOCATION: 312, HERBERT MACAULAY WAY, SABO YABA, LAGOS.
                TEL: 03293828343
                DATE: %s%n
                CASHIER'S NAME: %s%n
                CUSTOMER'S NAME: %s%n
                """, currentDateTime, cashierName,customerName);
        dashFormat();
        System.out.println();
        System.out.print("""
                            ITEM    QTY    PRICE    TOTAL(NGN)
                    """);
        oneDashFormat();
        System.out.println();

        for (int index = 0; index < products.size(); index++) {
            System.out.printf("%10s %6d %10.2f %10.2f%n", products.get(index),quantities.get(index),productPrices.get(index),
                    quantities.get(index) * productPrices.get(index));
            double amount = quantities.get(index) * productPrices.get(index);
            subTotal += amount;
        }
        oneDashFormat();
        System.out.println();
        System.out.printf("%25s %10.2f%n","Sub Total:", subTotal);
        System.out.printf("%25s %10.2f%n","Discount:", discount = (discount/100) * subTotal);
        System.out.printf("%25s %10.2f%n","VAT @ 7.50%:",tax = (7.50/100) * subTotal);
        dashFormat();
        System.out.println();
        double currentSubTotal = subTotal -discount + tax;
        System.out.printf("%25s %10.2f%n","Bill Total:", currentSubTotal);
        dashFormat();
        System.out.println();
        System.out.printf("%s %2.2f%n","THIS IS NOT A RECEIPT PAY: N", currentSubTotal);
        dashFormat();
        System.out.println();
        System.out.println("How much did the customer give to you? ");
        amountPaid = input.nextDouble();
    }

    public void printInvoice2(){

        System.out.printf("""
                SEMICOLON STORES
                MAIN BRANCH
                LOCATION: 312, HERBERT MACAULAY WAY, SABO YABA, LAGOS.
                TEL: 03293828343
                DATE: %s%n
                CASHIER'S NAME: %s%n
                CUSTOMER'S NAME: %s%n
                """, currentDateTime, cashierName,customerName);
        dashFormat();
        System.out.println();
        System.out.print("""
                        ITEM    QTY    PRICE    TOTAL(NGN)
                    """);
        oneDashFormat();
        System.out.println();

        for (int index = 0; index < products.size(); index++) {
            System.out.printf("%10s %6d %10.2f %10.2f%n", products.get(index),quantities.get(index),productPrices.get(index),
                    quantities.get(index) * productPrices.get(index));
            double amount = quantities.get(index) * productPrices.get(index);
            subTotal += amount;
        }

//        for (int index = 0; index < products.size(); index++) {
//            System.out.printf("%10s %6d %10.2f %10.2f%n", products.get(index),quantities.get(index),productPrices.get(index),
//                    quantities.get(index) * productPrices.get(index));
//            subTotal += quantities.get(index) + productPrices.get(index);
//        }
        oneDashFormat();
        System.out.println();
        System.out.printf("%25s %10.2f%n","Sub Total:", subTotal);
        System.out.printf("%25s %10.2f%n","Discount:", discount = (discount/100) * subTotal);
        System.out.printf("%25s %10.2f%n","VAT @ 7.50%:",tax = (7.50/100) * subTotal);
        dashFormat();
        System.out.println();
        double currentSubTotal = subTotal -discount + tax;
        System.out.printf("%25s %10.2f%n","Bill Total:", currentSubTotal);
        System.out.printf("%25s %10.2f%n","Amount Paid:", amountPaid);
        balance -= amountPaid-balance;
        System.out.printf("%25s %10.2f%n","Balance:", balance);
        dashFormat();
        System.out.println();
        System.out.println("THANK YOU FOR YOUR PATRONAGE");
        dashFormat();

    }



    private static void dashFormat(){
        for (int index = 0; index <= 50; index++) {
            System.out.print("=");


        }
    }
    private static String oneDashFormat(){
        for (int index = 0; index <= 50; index++) {
            System.out.print("-");


        }
        return "";
    }


    public static void main(String[] args) {
        Store store = new Store();
        store.customerDetails();
        store.customersOrder();
        store.printInvoice();
        store.printInvoice2();
    }
}
