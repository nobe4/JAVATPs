package Exo2;

/**
 * Created with IntelliJ IDEA.
 * User: padawan
 * Date: 12/2/13
 * Time: 8:57 AM
 * To change this template use File | Settings | File Templates.
 */
public class PolyPoint {
    private final Point[] points;
    private final int MAX_SIZE = 100;
    private int size;

    public PolyPoint() {
        size = 0;
        points = new Point[MAX_SIZE]; // 100 points max
    }

    public int pointCount() {
        return size;
    }

    public int pointCapacity() {
        return MAX_SIZE;
    }

    public boolean contains(Point p) {
        for (Point i : points) {
            if (i.equals(p)) return true;
        }
        return false;
    }

    public boolean add(Point p) {
        if (size >= MAX_SIZE) return false;
        points[size++] = p;
        return true;
    }
}
