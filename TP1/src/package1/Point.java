package package1;

/**
 * Created with IntelliJ IDEA.
 * User: padawan
 * Date: 11/27/13
 * Time: 4:59 PM
 * To change this template use File | Settings | File Templates.
 */
public class Point {

    private int x;
    private int y;

    /*
    déplacé dans Main.java
    public static void main(String[] args) {
        Point p = new Point();
        System.out.println(p.x  + " " + p.y);

        2.  On crée un objet Point, qui a comme valeur par défaut pour ses champs 0.
            ensuite on affiche les deux propriétés de cet objet.

    }
    */

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public Point(Point other) {
        this.x = other.x;
        this.y = other.y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    @Override
    public String toString() {
        return "(" + x + ',' + y +  ')';
    }

//    @Override
//    public boolean equals(Point point) {
//        return this.x == point.getX() && this.y == getY();
//    }
}
