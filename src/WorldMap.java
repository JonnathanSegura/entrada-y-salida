/*************************************************************************
 *  Compilation:  javac-introcs WorldMap.java
 *  Execution:    java-introcs WorldMap < usa.txt
 *  Dependencies: StdIn.java StdDraw.java
 *
 *  Reads a polygonal map description from standard input and draws it.
 *  Input format:
 *    width height
 *    regionName
 *    V
 *    x1 y1
 *    ...
 *    xV yV
 *  (repeats until EOF)
 *************************************************************************/
public class WorldMap {
    public static void main(String[] args) {
        int width  = StdIn.readInt();
        int height = StdIn.readInt();
        StdDraw.setCanvasSize(width, height);
        StdDraw.setXscale(0, width);
        StdDraw.setYscale(0, height);
        while (!StdIn.isEmpty()) {
            String name = StdIn.readString(); // consumed, not used for drawing
            int V = StdIn.readInt();
            double[] xs = new double[V];
            double[] ys = new double[V];
            for (int i = 0; i < V; i++) {
                xs[i] = StdIn.readDouble();
                ys[i] = StdIn.readDouble();
            }
            StdDraw.polygon(xs, ys);
        }
    }
}
