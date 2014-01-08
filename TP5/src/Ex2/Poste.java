package Ex2;

/**
 * Created by Thomas on 1/8/14.
 */
public class Poste {
    public static void main(String args[]) {
        // instancier un bureau b
        Bureau bureau = new Bureau();

        // ouvrir des nouveaux guichets g1, g2, g3, g4 dans le bureau b
        Guichet g1 = bureau.ouvrirNouveauGuichet();
        Guichet g2 = bureau.ouvrirNouveauGuichet();
        Guichet g3 = bureau.ouvrirNouveauGuichet();
        Guichet g4 = bureau.ouvrirNouveauGuichet();
        Guichet g5 = bureau.ouvrirNouveauGuichet();

        System.out.println("fermeture du guichet: " + g5);
        bureau.fermerGuichet(g5);

        // A DESACTIVER POUR VOIR CE QUI SE PASSE ...
        // bureau.fermerTousLesGuichets();
        // System.out.println("Bureau et guichets ouverts: \n" + bureau);

        // essayer d’ajouter un numéro d’usager aléatoire dans le bureau b
        // générer l’exception AucunGuichetOuvertException si aucun guichet n’est ouvert
        // ajout de 40 usagers!
        for (int i = 0; i <40; i++)
        {
            try {
                bureau.ajouterUsager((int)(Math.random()*100));
            }
            catch (AucunGuichetOuvertException e)
            {
                System.out.println(e.getMessage());
            }
        }

        System.out.println("Bureau et guichets ouverts avec leurs usagers: \n" + bureau);

                // VIDAGE DU GUICHET g1
                // essayer de retirer le premier numéro d’usager u du guichet g1   dans le bureau b
                // générer l’exception GuichetVideException si la file d’attente du guichet est vide
                System.out.println( "nombre d'usagers " + g1.fileUsagers.size() + "au guichet " + g1);
                        // pour ne pas entrer en conflit avec la taille de la file d'usagers qui se modifie dynamiquement!
        int taille = g1.fileUsagers.size(); // BOUH que le public C pas bô GG le document fourni
        for (int i = 0; i < taille; i++){
            try {
                int u = bureau.retirerPremierUsager(g1);
                System.out.println("usager " + u + " retiré du guichet "+ g1);
            }
            catch (GuichetVideException e)
            {
                System.out.println(e.getMessage());
            }
        }

        System.out.println("fermeture du guichet vide: " + g1);
        bureau.fermerGuichet(g1);

        System.out.println("Bureau et guichets ouverts avec leurs usagers: \n" + bureau);

                // retirer le premier usager du guichet g2
        try {
            int u = bureau.retirerPremierUsager(g2);
            System.out.println("usager " + u + " retiré du guichet " + g2);
        }
        catch (GuichetVideException e)
        {
            System.out.println(e.getMessage());
        }

        System.out.println("Bureau et guichets ouverts avec leurs usagers:  \n" + bureau);

                // fermer le guichet g2 du bureau b :
                // les usagers de sa file d’attente sont répartis dans les files  d’attente des
                // autres guichets ouverts et ferme ce guichet
                System.out.println("fermeture du guichet: " + g2);
        bureau.fermerGuichet(g2);

        System.out.println("Bureau et guichets ouverts avec leurs usagers: \n" + bureau);

                bureau.fermerTousLesGuichets();

        System.out.println("Bureau et guichets ouverts avec leurs usagers: \n" + bureau);
    }
}