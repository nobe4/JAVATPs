package b.calcul;

/**
 * Created by padawan on 12/14/13.
 */
public class Ex3 {
    public static void main(String[] args) {
        Expr v = new Value(33.0);
        System.out.println(v.toString());
        Expr a = new Add(new Value(7.0), v);
        System.out.println(a.toString());
        Expr m = new Mul(new Value(7.0), a);
        System.out.println(m.toString());
        Expr d = new Div(new Value(7.0), m);
        System.out.println(d.toString());
    }
}

abstract class Expr{
    public abstract double eval();
    public abstract String toString();
}

class Value extends Expr{
    double v = 0;
    public Value(double v) {this.v = v;}
    @Override
    public double eval() {
        return v;
    }
    @Override
    public String toString() {
        return "Value : " + String.valueOf(v);
    }
}

class Add extends Expr{
    private double v;

    public Add(Expr e1, Expr e2) {
        this.v = e1.eval() + e2.eval();
    }

    @Override
    public double eval() {
        return v;
    }

    @Override
    public String toString() {
        return "Add get : " + String.valueOf(v);
    }
}

class Mul extends Expr{
    private double v;

    public Mul(Expr e1, Expr e2) {
        this.v = e1.eval() * e2.eval();
    }

    @Override
    public double eval() {
        return v;
    }

    @Override
    public String toString() {
        return "Add get : " + String.valueOf(v);
    }
}

class Div extends Expr{
    private double v;

    public Div(Expr e1, Expr e2) {
        this.v = e1.eval() / e2.eval();
    }

    @Override
    public double eval() {
        return v;
    }

    @Override
    public String toString() {
        return "Add get : " + String.valueOf(v);
    }
}
