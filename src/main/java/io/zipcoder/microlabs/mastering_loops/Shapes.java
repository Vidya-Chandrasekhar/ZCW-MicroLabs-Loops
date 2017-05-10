package io.zipcoder.microlabs.mastering_loops;

public class Shapes {
    public static void main(String[] args) {
        Shapes shape = new Shapes();
        System.out.println(shape.triangle(5));
        System.out.println(shape.tableSquare(4));
        System.out.println(shape.tableSquares(6));
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
                sb.append("");
            }
        }
        return sb.toString();
    }

    public String tableSquare(int size) {
        StringBuilder sb = new StringBuilder();
        sb.append("tableSquare()\n");
        sb.append("*** Output ***");
        for (int row = 1; row <= size; row++) {
            sb.append("\n");
            for (int col = 1; col <= size; col++) {
                sb.append("|"+col * row+"|");
            }
        }
        return sb.toString();
    }

    public String tableSquares(int size) {
        StringBuilder sb = new StringBuilder();
        sb.append("\ntableSquares()\n");
        sb.append("*** Output ***");
        for (int row = 1; row <= size; row++) {
            sb.append("\n");
            for (int col = 1; col <= size; col++) {
                sb.append("|"+col * row+"|");
            }
        }
        return sb.toString();
    };

}
