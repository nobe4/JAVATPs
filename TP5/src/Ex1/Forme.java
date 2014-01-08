package Ex1;

// LA CLASSE FORME EST ABSTRAITE CAR ELLE N'A PAS DEFINIE LA METHODE size()
public  abstract class Forme implements Comparable<Forme>{
	/** @return -1, 0, 1 if this is <, = or > than x */
    protected Point centralPoint;
    public static Point originPoint = new Point(0, 0);

    @Override
	public int compareTo(Forme x) {
        if (this.size() < x.size()) {
            return -1 ;
        }
        if (this.size() > x.size()) {
            return 1 ;
        }
        return 0 ;
    }

    protected Forme() {
        this.centralPoint = originPoint;
    }

    protected Forme( int x, int y ) {
        this.centralPoint = new Point(x, y);
    }

    public double distanceOrigine(){
       return Math.sqrt(Math.pow((centralPoint.getX())-(originPoint.getX()),2) + Math.pow((centralPoint.getY())-(originPoint.getY()),2));
    }

    public abstract double size();
}

