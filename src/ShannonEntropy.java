/*************************************************************************
 *  Compilation:  javac-introcs ShannonEntropy.java
 *  Execution:    java-introcs ShannonEntropy m < data.txt
 *  Dependencies: StdIn.java StdOut.java
 *
 *  Reads a sequence of integers in the range [1, m] from standard input
 *  and prints the Shannon entropy to 4 digits after the decimal point.
 *************************************************************************/
public class ShannonEntropy {
    public static void main(String[] args) {
        int m = Integer.parseInt(args[0]);
        int[] count = new int[m + 1];
        int n = 0;
        while (!StdIn.isEmpty()) {
            int x = StdIn.readInt();
            if (x >= 1 && x <= m) {
                count[x]++;
                n++;
            }
        }
        double H = 0.0;
        for (int i = 1; i <= m; i++) {
            if (count[i] == 0) continue;
            double p = count[i] / (double) n;
            H += -p * (Math.log(p) / Math.log(2.0)); // log base 2
        }
        StdOut.printf("%.4f\n", H);
    }
}
