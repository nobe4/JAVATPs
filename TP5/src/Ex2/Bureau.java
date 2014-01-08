package Ex2;

import java.awt.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by Thomas on 1/8/14.
 */
public class Bureau implements Ibureau {
private ArrayList<Guichet> guichetsOuverts;
private ArrayList <Guichet> guichetsOuvertsClone;

    public Bureau() {
        guichetsOuverts = new ArrayList<Guichet>();
        guichetsOuvertsClone = new ArrayList<Guichet>(guichetsOuverts);
    }

    @Override
    public String toString() {
        return "Bureau{" +
                "guichetsOuverts=" + guichetsOuverts +
                '}';
    }

    @Override
    public Guichet ouvrirNouveauGuichet() {
        guichetsOuverts.add(new Guichet());
        return guichetsOuverts.get(guichetsOuverts.size() - 1); // Automatically get last element
    }

    @Override
    public void ajouterUsager(int numero) throws AucunGuichetOuvertException {
        if(guichetsOuverts.isEmpty())
            throw new AucunGuichetOuvertException();

        Collections.max(guichetsOuverts).fileUsagers.add(numero);
    }

    @Override
    public int retirerPremierUsager(Guichet g) throws GuichetVideException {
        if(g.fileUsagers.isEmpty())
            throw new GuichetVideException();

        int returnValue = g.fileUsagers.get(0);
        g.fileUsagers.remove(0);

        System.out.println("usager "+returnValue+" retiré du guichet " + g);
        return returnValue;
    }

    @Override
    public void fermerGuichet(Guichet g) {
        if(guichetsOuverts.contains(g)){    // Bah oui faut check si il est là avant de le fermer ....
            guichetsOuverts.remove(g);  // Ce serait con de le reremplir en le vidant
            for(int  i=0; i< g.fileUsagers.size();){
                try {
                    ajouterUsager(retirerPremierUsager(g)); // Affichage légèrement différent du fait de l'appel de retirer permier
                } catch (AucunGuichetOuvertException e) {
                    e.printStackTrace();
                } catch (GuichetVideException e) {
                    e.printStackTrace();
                }
            }
        }

    }

    public void fermerTousLesGuichets (){
        List <Guichet> guichetsOuvertsClone = new ArrayList<Guichet>(guichetsOuverts);
        for (Guichet guichet : guichetsOuvertsClone)
            this.fermerGuichet(guichet);
    }
}
