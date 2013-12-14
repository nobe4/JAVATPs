/**
 * Created by padawan on 12/14/13.
 */
public class Ex2 {
    public static void main(String[] argv) {
        Racine extracteur = new Racine(0.01);
        double operande = -1; //(Double.valueOf(argv[0])).doubleValue();
        double valeurRacine;

        try {
            valeurRacine = extracteur.racine(operande);
            System.out.println(valeurRacine);
            System.out.println("precision " + extracteur.getPrecision() + " , erreur =" + (valeurRacine - Math.sqrt(operande)));
        } catch (NegativeNumberExeption e) {
            System.out.println(e.toString());
        }

        extracteur.setPrecision(0.00001);

        try {
            valeurRacine = extracteur.racine(operande);
            System.out.println(valeurRacine);
            System.out.println("precision " + extracteur.getPrecision() + " , erreur =" + (valeurRacine - Math.sqrt(operande)));
        } catch (NegativeNumberExeption e) {
            System.out.println(e.toString());
        }

    }
}

class Racine {
    private double precision;

    Racine(double precision) {
        this.precision = precision;
    }

    double racine(double operande) throws NegativeNumberExeption {
        if(operande < 0) throw new NegativeNumberExeption(String.valueOf(operande));

        double solution, carre, a, b;
        a = 0;
        b = operande;
        solution = (a + b) / 2;
        while (b - a > precision) {
            carre = solution * solution;
            if (carre > operande) b = solution;
            else a = solution;
            solution = (a + b) / 2;
        }
        return solution;
    }

    double getPrecision() {
        return precision;
    }

    void setPrecision(double precision) {
        this.precision = precision;
    }
}

class NegativeNumberExeption extends Exception{
    NegativeNumberExeption(String message) {
        super(message);
    }
}