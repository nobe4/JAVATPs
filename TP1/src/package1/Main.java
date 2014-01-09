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
 * Date: 11/27/13
 * Time: 5:03 PM
 * To change this template use File | Settings | File Templates.
 */
public class Main {
    public static void main(String[] args) {
        Point p = new Point(1, 1);
        p.setX(2);
        p.setY(3);
        Point p2 = new Point(p);
        System.out.println(p.toString());
        System.out.println(p2.getX() + " " + p2.getY());
        /*
        3.  Ici on ne peut pas accéder aux propriétés de l'objet p car celles ci sont privées à la classe.
            Pour parer à se problème on peut utiliser des accesseurs sur ces propriétés.
        4.  Il est impératif de garder les propriétés privés pour conserver la philosphie du modèle objet :
                on n'utilise que les méthodes et elles gèrent les valeurs des propriétés.
         */
    }
}
