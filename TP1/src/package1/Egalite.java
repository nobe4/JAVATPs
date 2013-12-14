package package1;

import java.util.ArrayList;

/**
 * Created with IntelliJ IDEA.
 * User: padawan
 * Date: 11/27/13
 * Time: 7:19 PM
 * To change this template use File | Settings | File Templates.
 */
public class Egalite {
    public static void main(String[] args) {
        Point p1 = new Point(1,2);
        Point p2 = p1;
        Point p3 = new Point(1,2);
        System.out.println(p1 == p2);     // true
        System.out.println(p1 == p3);     // false

        ArrayList<Point> list = new ArrayList();
        list.add(p1);
        // test is done with the equal method
        System.out.println(list.indexOf(p2));   // 0
        System.out.println(list.indexOf(p3));   // -1



    }
}
