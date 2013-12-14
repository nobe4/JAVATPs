package Exo2;

import java.util.LinkedList;

/**
 * Created with IntelliJ IDEA.
 * User: padawan
 * Date: 12/2/13
 * Time: 9:19 AM
 * To change this template use File | Settings | File Templates.
 */
public class FreePolyLine {
    private LinkedList<Point> points;

    public FreePolyLine() {
        points = new LinkedList<Point>();
    }

    private void add(Point p){
        points.add(p);
    }

    public int pointCapacity(){return points.size();}
    public boolean contains(Point p){return points.contains(p);}
    public int pointCount(){return 0;}
}
