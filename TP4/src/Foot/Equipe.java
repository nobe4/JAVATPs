package Foot;

import java.util.LinkedHashSet;
import java.util.Set;

/**
 * Created by padawan on 12/14/13.
 */
public class Equipe {
    public final static int NBJOUEUR = 11;
    private String club;
    private Set<Joueur> joueurs;

    public Equipe(String club) {
        this.club = club;
        joueurs = new LinkedHashSet<Joueur>();
    }

    public void add(Joueur j) throws MauvaiseEquipeException, EquipePleineException {
        if(joueurs.size() == 11) throw new EquipePleineException("11 joueurs max");
        else{
            if(joueurs.size() != 0 && j.getClub() != club) throw new MauvaiseEquipeException(j.getClub() + " != " + club);
            else{
                joueurs.add(j);
            }
        }
    }

    public String getClub() {
        return club;
    }

    public void removeJoueur(Joueur j){
        joueurs.remove(j);
    }

    public Set<Joueur> getJoueurs() {
        return joueurs;
    }

    @Override
    public String toString() {
        return "Equipe{" +
                "club='" + club + '\'' +
                ", joueurs=" + joueurs +
                '}';
    }

}
