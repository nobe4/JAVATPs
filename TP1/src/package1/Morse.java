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
 * Time: 11:12 AM
 * To change this template use File | Settings | File Templates.
 */
public class Morse {
    public static void main(String[] args) {
        String result = "";
        for (String s : args) {
            result += s + " Stop. ";
        }

        StringBuilder result2 = new StringBuilder();
        for (String s : args) {
            result2.append(s + " Stop. ");
        } // avantage ?

        System.out.println(result);
        System.out.println(result2);


        String first = args[0];
        String second = args[1];
        String last= args[2];
        System.out.println(first + ' ' + second + ' ' + last);

        // quelle différence il y a-t-il ?

    }
}
