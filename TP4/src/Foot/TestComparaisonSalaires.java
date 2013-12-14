package Foot;

import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;

/**
 * Created by padawan on 12/15/13.
 */
public class TestComparaisonSalaires {
    public TestComparaisonSalaires(Partie p) {
        LinkedList<Acteur> l =  p.trierSalaires();

        Collections.sort(l, new Comparator<Acteur>() {

            @Override
            public int compare(Acteur o1, Acteur o2) {
                if (o1.getSalaire() > o2.getSalaire()) {
                    return -1;
                } else if (o1.getSalaire() == o2.getSalaire()) {
                    return 0;
                } else {
                    return 1;
                }
            }
        });

        System.out.println(l.toString());
    }
}
