package Ex1;

// Comparables par leur taille
public class Triangle extends Forme {
	private double base;
	private double hauteur ;

	public Triangle(double base, double hauteur) {
        super();
		this.base = base;
		this.hauteur= hauteur;
	}

    public Triangle(int x, int y, double base, double hauteur) {
        super(x, y);
        this.base = base;
        this.hauteur= hauteur;
    }

	@Override
	public double size() {
		return .5 * (base*hauteur);
	}

	@Override
	public String toString() {
		return "Triangle [taille =" + this.size() + "]";
	}
}
