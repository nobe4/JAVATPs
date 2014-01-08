package Ex2;

/**
 * Created by Thomas on 1/8/14.
 */
public interface Ibureau {
    public Guichet ouvrirNouveauGuichet ();
    public void ajouterUsager (int numero) throws AucunGuichetOuvertException;
    public int retirerPremierUsager (Guichet g) throws GuichetVideException;
    public void fermerGuichet (Guichet g);
}
