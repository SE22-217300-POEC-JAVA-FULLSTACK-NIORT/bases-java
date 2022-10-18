package java_poo.payment;

public class MockPaypal implements Payment{
    @Override
    public void pay() {
        System.out.println("Fausse version de paypal");
    }
}
