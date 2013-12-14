package Foot;

/**
 * Created by padawan on 12/14/13.
 */
public class Joueur extends Acteur{
    protected String club;
    protected double euroM;

    public Joueur(String nom, String prenom, int age, double euroM, String club) {
        super(nom, prenom, age);
        this.club = club;
        this.euroM = euroM;
    }

    public Joueur(String nom, String prenom, int age, double euroM) {
        this(nom, prenom, age, euroM, "NoPlaying Inc");
    }

    public String getClub() {
        return club;
    }


    @Override
    public double getSalaire() {
        return Math.random()*euroM;
    }

    @Override
    public String toString() {
        return "Joueur{" +
                super.toString()+
                "club='" + club + '\'' +
                ", euroM=" + euroM +
                '}';
    }
}
