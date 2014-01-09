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

package Exo2;

import java.util.LinkedList;

/**
 * Created with IntelliJ IDEA.
 * User: padawan
 * Date: 12/2/13
 * Time: 9:19 AM
 * To change this template use File | Settings | File Templates.
 */
public class FreePolyLine {
    private LinkedList<Point> points;

    public FreePolyLine() {
        points = new LinkedList<Point>();
    }

    private void add(Point p){
        points.add(p);
    }

    public int pointCapacity(){return points.size();}
    public boolean contains(Point p){return points.contains(p);}
    public int pointCount(){return 0;}
}
