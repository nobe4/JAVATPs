package package1;

/**
 * Created with IntelliJ IDEA.
 * User: padawan
 * Date: 11/28/13
 * Time: 8:02 AM
 * To change this template use File | Settings | File Templates.
 */
public class MyString {
    public static void main(String[] args) {
        String s1 = "toto";
        String s2 = s1;                 // s2 est le même objet que s1
        String s3 = new String(s1);     // s1 contient la même chaine de caractère que s1
        System.out.println(s1 == s2);   // s1 est bien le même objet que s2
        System.out.println(s1 == s3);   // s1 n'est pas le même objet que s3
        System.out.println(s1.equals(s3));   // s1 contient la même chaine que s3

        String s4 = "toto";
        String s5 = "toto";
        System.out.println(s4 == s5); // affiche true car les chaines sont identiques et java n'a pas fait deux allocations pour les deux chaines


        String s = "hello";
        s.toUpperCase();
        System.out.println(s); // affiche hello car le retour de la fonction toUpperCase est ignoré

    }
}
