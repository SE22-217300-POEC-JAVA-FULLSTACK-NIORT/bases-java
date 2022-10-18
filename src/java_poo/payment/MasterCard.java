package java_poo.payment;

public class MasterCard implements Payment{
    @Override
    public void pay() {
        System.out.println("Paiment par Mastercard en cours...");
    }
}
