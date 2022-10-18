package java_poo.jeux;

// Finaliser la hiérarchie de classes selon la version actuelle du code
public class MainPersonnage {
    public static void main(String[] args) {
        var chris=new Guerrier("Christian",100,"Kalashnikov Ak-47");
        chris.setNom("Christian Lisangola");
        System.out.println(chris.getNom());
        chris.rencontrer();

        var sophie=new Magicien("Sophie",200,"Ma baquette");
        sophie.rencontrer();

        var pierre=new Sorcier("Pierre Gauthier",150,"Baguette Pierre","Baton Pierre");
        pierre.rencontrer();
//        Pas possible, car Personnage est une classe abstraite, qui ne peut pas avoir
//        d'instances(objets)
//        var azadeh=new Personnage("Azadeh",500);

//        System.out.println(pierre);
    }
}
