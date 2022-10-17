package java_poo;

// Le noms et prenom doivent avoir au moins 5 caractères
// Mot de passe au moins 8 caractères
// Email doit avoir un @
//constructeur par défaut par défaut : Version minimale du constructeur invoquée par la
// JVM lorsqu'aucun autre constructeur n'est explicitement implementé
public class User {
    private String firstName;
    private String lastName;
    private String email;
    private String password;

    private int age;

    private double weight;

    private boolean married;


    public User(String firstName,String lastName,String email,String password){
        this.firstName=firstName;
        this.lastName=lastName;
        this.email=email;
        this.password=password;
    }

    public User(){
        this.firstName="";
        this.lastName="";
        this.email="";
        this.password="";
        this.age=1;
        this.married=true;
        this.weight=1;
    }

    // getters : Accesseurs
    // setters : manipulateurs

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public boolean isMarried() {
        return married;
    }

    public void setMarried(boolean married) {
        this.married = married;
    }
}