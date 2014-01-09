/*
 * The MIT License (MIT)
 *
 * Copyright (c) 2013.  Victor Haffreingue
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy of
 * this software and associated documentation files (the "Software"), to deal in
 * the Software without restriction, including without limitation the rights to
 * use, copy, modify, merge, publish, distribute, sublicense, and/or sell copies of
 * the Software, and to permit persons to whom the Software is furnished to do so,
 * subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS
 * FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR
 * COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER
 * IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN
 * CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
 */

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
