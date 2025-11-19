/*************************************************************************
 *  Compilation:  javac-introcs Checkerboard.java
 *  Execution:    java-introcs Checkerboard n
 *  Dependencies: StdDraw.java
 *
 *  Draws an n-by-n checkerboard using standard drawing.
 *  Lower-left square is blue; the other color is light gray.
 *************************************************************************/
import java.awt.Color;
public class Checkerboard {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        // Coordinate system from 0 to n on both axes
        StdDraw.setXscale(0, n);
        StdDraw.setYscale(0, n);
        // Draw squares
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                boolean blue = ((i + j) % 2 == 0); // lower-left is blue
                if (blue) StdDraw.setPenColor(Color.BLUE);
                else      StdDraw.setPenColor(Color.LIGHT_GRAY);
                StdDraw.filledSquare(i + 0.5, j + 0.5, 0.5);
            }
        }
    }
}
