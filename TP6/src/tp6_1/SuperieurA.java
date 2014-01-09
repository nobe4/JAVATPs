package tp6_1;

/**
 * Created with IntelliJ IDEA.
 * User: Seb
 * Date: 08/01/14
 * Time: 21:13
 * To change this template use File | Settings | File Templates.
 */
public class SuperieurA implements Condition{

    private int ref;
    public SuperieurA(int a) {
        ref = a;
    }

    public int getRef() {
        return ref;
    }

    @Override
    public boolean verif(int i) {
        return isStrictSup(i);
    }

    @Override
    public boolean equals() {
        return false;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public int hashcode() {
        return 0;  //To change body of implemented methods use File | Settings | File Templates.
    }

    public boolean isStrictSup(int a)
    {
        return (ref > a);
    }

    @Override
    public String toString() {
        return ("SuperieurA(" + ref + ")");    //To change body of overridden methods use File | Settings | File
        // Templates.
    }
}
