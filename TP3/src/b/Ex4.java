package b;

/**
 * Created by padawan on 12/14/13.
 */

class A {
    public void a() {System.out.println("Aa"); }
    void b(B b) {System.out.println("Ab(B)");}
    void c() {System.out.println("Ac");}
    void c(A a) {System.out.println("Ac(A)"); }
    static void d() {System.out.println("static Ad");}
    protected void e() {System.out.println("Ae");}
    private void f() {System.out.println("Af");}
    public void printF() { f(); }
    Object g() {System.out.println("Ag"); return 2;}
    char h() {System.out.println("Ah"); return 2;}
    void i() {System.out.println("Ai");}
    void j() {System.out.println("Aj"); }
    void k() {System.out.println("Ak"); }
    void l() {System.out.println("Al"); }
    void m() {System.out.println("Am"); }
}

class B extends A{
    public void a() {System.out.println("Ba"); }
    protected void b(B b) {System.out.println("Bb(B)");}
    public void c(A a) {System.out.println("Bc(A)");}
    void c(B b) {System.out.println("Bc(B)"); }
    static void d() {System.out.println("static Bd");}
    static void d(A a) {System.out.println("Bd(A a)");}

    protected void f() {System.out.println("Bf");}
    String g() {System.out.println("Bg"); return "c";}
    char h() {System.out.println("Bh"); return 'c';}

    void j() {System.out.println("Bj"); }
    void k() {System.out.println("Bk"); }
    void l() {System.out.println("Bl");}
    void m() {System.out.println("Bm");
    }
}

public class Ex4 {

    public static void main(String[] args){

        A a = new A();
        A ab = new B();
        B b = new B();
        a.a();
        ab.a();
        b.a();
        ((A)ab).a();
        ab.b(null);
        ab.c();
        ab.c(a);
        ab.c(ab);
        ab.c(b);
        a.d();
        ab.d();
        a.printF();
        ab.printF();
        ab.j();
        ab.k();
        ab.l();
        ab.m();
    }
}

