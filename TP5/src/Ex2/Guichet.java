package Ex2;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Thomas on 1/8/14.
 */
public class Guichet implements Comparable<Guichet> {   // On implement Comparable pour la comparaison de la taille des files
    public static int currentGuichetNumber = 1;

    private int numero;
    public ArrayList<Integer> fileUsagers;  // PAS BO le public BOUH le doc fourni

    public Guichet() {
        // Staticage du nombre de guichet, on peut aussi faire un container
        numero = currentGuichetNumber;
        currentGuichetNumber++;

        fileUsagers = new ArrayList<Integer>();
    }

    @Override
    public int compareTo(Guichet o) {
        if (this.fileUsagers.size() > o.fileUsagers.size()) {
            return -1 ;
        }
        if (this.fileUsagers.size() < o.fileUsagers.size()) {
            return 1 ;
        }
        return 0 ;
    }

    @Override
    public String toString() {
        return "Guichet{" +
                "numero=" + numero +
                ", fileUsagers=" + fileUsagers +
                '}';
    }
}
