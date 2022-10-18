package java_poo.payment;

import java.util.ArrayList;
import java.util.List;

public class MainPayment {
    public static void main(String[] args) {
        var mastercard=new MasterCard();
        var paypal=new PaypalPayment();
        var visa=new VisaPayment();
        var payment=new PaymentService(mastercard);
    }
}
