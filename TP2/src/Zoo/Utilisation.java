package Zoo;

/**
 * Created with IntelliJ IDEA.
 * User: padawan
 * Date: 12/2/13
 * Time: 8:19 AM
 * To change this template use File | Settings | File Templates.
 */
public class Utilisation {

    public static void main(String[] args) {
        Zoo z = new Zoo();
        z.add(new Chien(10, "Regis", "Nono"));
        z.add(new Chat(10, "B", "C"));
        z.add(new Chat(10, "D", "E"));

        System.out.println(z);
    }
}
