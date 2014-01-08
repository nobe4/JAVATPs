package Ex1;

// Comparables par leur taille
public class Rectangle extends Forme {
    private double largeur ;
     private double longueur ;
    
    public Rectangle(double largeur, double longueur) {
        super();
        this.largeur = largeur;
        this.longueur = longueur;
    }

    public Rectangle(int x, int y, double largeur, double longueur) {
        super(x, y);
        this.largeur = largeur;
        this.longueur = longueur;
    }
  
    @Override
    public double size() {
        return largeur*longueur;
    }

    
    @Override
	public String toString() {
		return "Rectangle [taille =" + this.size() + "]";
	}
}
