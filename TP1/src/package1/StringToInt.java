package package1;

import java.util.Arrays;

/**
 * Created with IntelliJ IDEA.
 * User: padawan
 * Date: 11/27/13
 * Time: 4:31 PM
 * To change this template use File | Settings | File Templates.
 */
public class StringToInt {
    public static void main(String[] args) {
        StringToInt sti = new StringToInt();
        // Create the stringarray
        String[] stringArray = {"3", "4", "-12", "42"   /*,"NaN"*/};
        // Create the int array
        int[] intArray = sti.getValues(stringArray);
        // Display the array
        System.out.println(Arrays.toString(intArray));
        System.out.print("[");
        for (int i : intArray) {
            System.out.print(i);
            System.out.print(" ");
        }
        System.out.println("]");

        // Display the sum
        System.out.println(sti.getSum(intArray));

    }

    public int[] getValues(String[] array) {
        // array that will be returned
        int[] retour = new int[array.length];

        for (int i = 0; i < array.length; i++) {
            // parse the string and put the value in the new array
            retour[i] = Integer.parseInt(array[i]);
        }
        return retour;
    }

    public int getSum(int[] array) {
        int value = 0;
        for (int i : array) {
            value += i;
        }
        return value;
    }

    /*
    2.  Statique signifie que la méthode peut être appelée sans instance de la classe Integer.
    3.  Quand une chaine de caractère est passée dans parseInt(), il y a une exception d'envoyée : NumberFormatException
     */
    // no toString needed
}
