package java_poo.jeux;

//DRY

// Points communs:
//- nom(1)
// - dureeDeVie(2)
// - getters(4) et setters(6) pour : nom du dureeDeVie
// - rencontrer()


// - Personnages

public class Guerrier extends Personnage{
    private String arme;

    public Guerrier(String nom, int dureeDeVie, String arme) {
        super(nom,dureeDeVie);
        this.arme = arme;
    }


    public String getArme() {
        return arme;
    }

    public void setArme(String arme) {
        this.arme = arme;
    }

    public void rencontrer(){
        System.out.println("Je suis un guerrier");
    }
}
