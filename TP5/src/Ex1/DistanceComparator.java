package Ex1;

import java.util.Comparator;

/**
 * Created by Thomas on 1/8/14.
 */
public class DistanceComparator implements Comparator<Forme> {

    // Doc comparator
    // Returns: a negative integer, zero, or a positive integer as the first argument is less than, equal to, or greater than the second.
    @Override
    public int compare(Forme o1, Forme o2) {
        if(o1.distanceOrigine() < o2.distanceOrigine()) // CPU time best than  memory usage
            return -1;
        else if(o1.distanceOrigine() == o2.distanceOrigine())   // it's java after all
            return 0;
        else
            return 1;
    }
}
