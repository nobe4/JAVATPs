package Foot;

/**
 * Created by padawan on 12/14/13.
 */
public abstract class Acteur {
    private final String nom, prenom;
    private int age;

    protected Acteur(String nom, String prenom, int age) {
        this.nom = nom;
        this.prenom = prenom;
        this.age = age;
    }

    public abstract double getSalaire();

    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }


    @Override
    public String toString() {
        return "Acteur{" +
                "nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                ", age=" + age +
                ", salaire=" + String.valueOf(getSalaire()) +
                '}';
    }
}
