package tp6_1;

/**
 * Created with IntelliJ IDEA.
 * User: Seb
 * Date: 08/01/14
 * Time: 21:16
 * To change this template use File | Settings | File Templates.
 */
public class InclusIntervalle implements Condition{

    private int inf;
    private int sup;

    public InclusIntervalle(int inf, int sup) {
        this.inf = inf;
        this.sup = sup;
    }

    public int getInf() {
        return inf;
    }

    public int getSup() {
        return sup;
    }

    @Override
    public boolean verif(int i) {
        return isInclude(i);
    }

    @Override
    public boolean equals() {
        return false;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public int hashcode() {
        return 0;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public String toString() {
        return "InclusIntervalle(" +
                inf + "," + sup + ")";
    }

    public boolean isInclude(int i)
    {
        if (i >= inf)
            if (i < sup)
                return true;
         return false;
    }
}
