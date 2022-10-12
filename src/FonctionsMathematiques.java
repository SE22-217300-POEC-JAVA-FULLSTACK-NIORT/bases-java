public class FonctionsMathematiques {
    public static void main(String[] args) {
        double nombre=3;
//        Puissance d'un nombre
        double nombreAuCarre=Math.pow(nombre,2);
        double nombreAuCube=Math.pow(nombre,3);
        double nombreAALaPuissance10=Math.pow(nombre,10);
        System.out.printf("3 au carré : %f\n",nombreAuCarre);
        System.out.printf("3 au cube : %f\n",nombreAuCube);
        System.out.printf("3 à la puissance 10 : %f\n",nombreAALaPuissance10);

//        racine carré
        double racineCarreNombre=Math.sqrt(9);
        System.out.printf("Racine carré de 9 : %f",racineCarreNombre);

//        PI
        double pi=Math.PI;
    }
}
