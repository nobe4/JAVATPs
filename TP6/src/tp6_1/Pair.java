package tp6_1;

/**
 * Created with IntelliJ IDEA.
 * User: Seb
 * Date: 08/01/14
 * Time: 21:02
 * To change this template use File | Settings | File Templates.
 */
public class Pair implements Condition{

    public Pair() {
    }

    @Override
    public boolean verif(int i) {
        return isPair(i);
    }

    @Override
    public boolean equals() {
        return false;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public int hashcode() {
        return 0;  //To change body of implemented methods use File | Settings | File Templates.
    }

    public String toString()
    {
        return "Pair";

    }

    public boolean isPair(int a)
    {
        if(a%2 == 0)
            return true;
        else
            return false;
//        return !(a%2);
    }
}
