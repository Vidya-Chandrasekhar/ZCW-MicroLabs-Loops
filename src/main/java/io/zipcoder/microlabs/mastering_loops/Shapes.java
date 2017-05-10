package io.zipcoder.microlabs.mastering_loops;

public class Shapes {
    public static void main(String[] args) {
        Shapes shape = new Shapes();
        System.out.println(shape.triangle(5));
    }


    public String triangle(int row) {

        int i;
        int j;
        StringBuilder sb = new StringBuilder();
        sb.append("triangle()\n");
        sb.append("*** Output ***");
        for (i = 1; i <= row; i++) {
            sb.append("\n");
            for (j = 1; j <= i; j++) {
                sb.append("*");
            }
        }
        return sb.toString();
    }

    public String tableSquare() {
        return "";
    }

    public String tableSquares(int n) {
        return "";
    }
}
