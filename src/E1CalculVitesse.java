public class E1CalculVitesse {
    public static void main(String[] args) {
        double distanceParcourue=300;
        double temps=6;
        double vitesse=distanceParcourue/temps;
        System.out.println("Vitesse : "+vitesse+"m/s");
        // vitesse = 300/6 = 50 m/s
        // %f : nombres à virugles
        // .%f
        // %.2f
        // %.3f
//        System.out.printf("vitesse = %f/%f = %f",distanceParcourue,temps,vitesse);
        System.out.printf("vitesse = %.2f/%.2f = %.2f",distanceParcourue,temps,vitesse);
    }
}
