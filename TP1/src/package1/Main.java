package package1;

/**
 * Created with IntelliJ IDEA.
 * User: padawan
 * Date: 11/27/13
 * Time: 5:03 PM
 * To change this template use File | Settings | File Templates.
 */
public class Main {
    public static void main(String[] args) {
        Point p = new Point(1, 1);
        p.setX(2);
        p.setY(3);
        Point p2 = new Point(p);
        System.out.println(p.toString());
        System.out.println(p2.getX() + " " + p2.getY());
        /*
        3.  Ici on ne peut pas accéder aux propriétés de l'objet p car celles ci sont privées à la classe.
            Pour parer à se problème on peut utiliser des accesseurs sur ces propriétés.
        4.  Il est impératif de garder les propriétés privés pour conserver la philosphie du modèle objet :
                on n'utilise que les méthodes et elles gèrent les valeurs des propriétés.
         */
    }
}
