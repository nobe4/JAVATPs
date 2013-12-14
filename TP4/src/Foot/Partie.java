package Foot;

import java.util.*;

/**
 * Created by padawan on 12/14/13.
 */
public class Partie {
    private Equipe[] equipes = new Equipe[2];
    private Arbitre arbitre;
    private int[] scores;

    public Partie(Equipe e1, Equipe e2, Arbitre arbitre) {
        equipes[0] = e1;
        equipes[1] = e2;
        this.arbitre = arbitre;
        scores = new int[]{0, 0};
    }

    public void marquer(Joueur j) {
        if (equipes[0].getClub().equals(j.getClub())) scores[0]++;
        else scores[1]++;
    }

    @Override
    public String toString() {
        return "Partie{" +
                "equipes=" + Arrays.toString(equipes) +
                ", arbitre=" + arbitre +
                ", scores=" + Arrays.toString(scores) +
                '}';
    }

    public Equipe[] getEquipes() {
        return equipes;
    }

    public LinkedList<Acteur> trierSalaires(){
        LinkedList<Acteur> r = new LinkedList<Acteur>();
        for(Acteur a : equipes[0].getJoueurs()){
            r.add(a);
        }
        for(Acteur a : equipes[1].getJoueurs()){
            r.add(a);
        }
        r.add(arbitre);
        return r;
    }
}

/*


Dans la classe Arbitre ajouter une méthode validerUnBut pour un joueur passé en
paramètre.
8)
Ecrire une classe de test TestPartie permettant de tester les méthodes écrites
précédemment.
 */