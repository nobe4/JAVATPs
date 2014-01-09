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
