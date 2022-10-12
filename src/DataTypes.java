public class DataTypes {
    public static void main(String[] args) {
        int age = 44;
        String nom = "Lisangola";
        String prenom = "Christian";
        double poids = 80.3;

//        System.out.println("Nom : "+nom);
//        System.out.println("Prenom : "+prenom);
//        System.out.println("Age : "+age+" ans");
//        System.out.println("Poids : "+poids+"kg");
//        System.out.println("Je suis "+prenom+" "+nom+", et j'ai "+age+"ans.");
//        %d : entiers
//        %f : nombres à virugle
//        %s : string
        System.out.printf("Je suis %s %s, et j'ai %d ans.", prenom, nom, age);
        double valeur = 67.56;
        System.out.printf("Valeur : %.1f", valeur);
    }
}
