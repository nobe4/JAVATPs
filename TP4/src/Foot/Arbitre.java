package Foot;

/**
 * Created by padawan on 12/14/13.
 */
public class Arbitre extends Acteur{

    enum XP{debutant(1),confirme(2), expert(3);
        int value;
         XP(int i) {
             value = i;
        }
        public int getValue() {
            return value;
        }
    };


    protected XP degre;
    private Partie partie;

    public Arbitre(String nom, String prenom, int age, XP degre) {
        super(nom, prenom, age);
        this.degre = degre;
        this.partie = null;
    }

    @Override
    public double getSalaire() {
        return Math.random()*10*degre.getValue();
    }

    @Override
    public String toString() {
        return "Arbitre{" +
                "degre=" + degre +
                "} " + super.toString();
    }

    public void setPartie(Partie partie) {
        this.partie = partie;
    }

    public boolean validerBut(Joueur j){
        //pardon ?
        return true;
    }

    public void expulse(Joueur j) throws HorsEquipeException{
        if(j.getClub() == partie.getEquipes()[0].getClub()){
            partie.getEquipes()[0].removeJoueur(j);
        }else if(j.getClub() == partie.getEquipes()[1].getClub()){
            partie.getEquipes()[1].removeJoueur(j);
        }else{
            throw new HorsEquipeException("joueur dans aucune équipe");
        }
    }

}
