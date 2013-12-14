package package1;

import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * User: padawan
 * Date: 11/27/13
 * Time: 4:15 PM
 * To change this template use File | Settings | File Templates.
 */
public class Calculatrice {
    public static void main(String[] args) {
        Scanner scanner;
        scanner = new Scanner(System.in);
        int value;
        value = scanner.nextInt();
        /*
         1.
         */
        // System.out.println(value);
        /*
        2. variables :  scanner de type Scanner à la ligne 14
                        value de type int à la ligne 16
         */
        /*
        3. import java.util.Scanner; va aller chercher dans la librairie de base de java la classe Scanner du package util.
            de cette manière on pourra utiliser le type Scanner comme un type de base comme int ou String
         */

        int value2;
        value2 = scanner.nextInt();
        int somme = value + value2;
        int difference = value - value2;
        int produit = value * value2;
        float quotient = (float) (value) / (float) (value2); // no security against /0
        int reste = value % value2;

        System.out.println("Somme : " + somme);
        System.out.println("Différence : " + difference);
        System.out.println("Produit : " + produit);
        System.out.println("Quotient : " + quotient);
        System.out.println("Reste : " + reste);
    }
    // no toString needed
}