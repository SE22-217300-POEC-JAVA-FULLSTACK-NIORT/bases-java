package java_poo.payment;


// S O L I D
public class PaymentService {

    private Payment paymentMethod;

    public PaymentService(Payment paymentMethod){
        this.paymentMethod=paymentMethod;
    }

    public void processPayment(){
        this.paymentMethod.pay();
    }


//    private String paymentMethod;



//    public PaymentService(String paymentMethod){
//        this.paymentMethod=paymentMethod;
//    }
//
//    public void processPayment(){
//        if(this.paymentMethod=="Paypal"){
//            System.out.println("Paiement par paypal en cours...");
//        }
//
//        if(this.paymentMethod=="visa"){
//            System.out.println("Paiement par visa en cours...");
//        }
//
//        if(this.paymentMethod=="mastercard"){
//            System.out.println("Paiement par mastercard en cours...");
//        }
//
//        if(this.paymentMethod=="Bitcoin"){
//            System.out.println("Paiement par Bitcoin en cours...");
//        }
//
//    }
}
