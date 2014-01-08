package Ex1;

public class Square extends Rectangle {
 
    public Square(double largeur) {
        super(largeur, largeur);
    }

    public Square(int x, int y, double largeur) {
        super(x, y, largeur, largeur);
    }

    @Override
	public String toString() {
		return "Carre [taille =" + this.size() + "]";
	}
}
