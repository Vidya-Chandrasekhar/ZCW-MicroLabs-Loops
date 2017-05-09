package io.zipcoder.microlabs.mastering_loops;

import java.util.Random;
import javax.swing.*;

public class Numbers {


    private String n;

    public String oneToTen() {

        String stringOutput = "*** Output ***\n" + " oneToTen()\n";
        String oneToTenOutput = "";

        for (int i = 1; i < 11; i++) {
            if (i <= 9) {
                oneToTenOutput = oneToTenOutput + Integer.toString(i) + "\n";
            } else {
                oneToTenOutput = oneToTenOutput + Integer.toString(i);

            }
        }
        return stringOutput + oneToTenOutput;
    }

    public String oddNumbers() {

        String stringOutput = "*** Output ***\n" + " oddNumbers()\n";
        String oddNumbersOutput = "";


        for (int j = 1; j <= 20; j++) {
            if (j % 2 == 1 && j < 19) {
                oddNumbersOutput = oddNumbersOutput + Integer.toString(j) + "\n";
            } else if (j % 2 == 1 && j >= 19) {
                oddNumbersOutput = oddNumbersOutput + Integer.toString(j);
            }
        }
        return stringOutput + oddNumbersOutput;
    }

    public String squares() {

        String stringOutput = "*** Output ***\n" + " squares()\n";
        String squareOutput = "";


        int k = 1;
        while (k <= 10) {
            int sqr = k * k;
            k++;
            if (k <= 10) {
                squareOutput = squareOutput + Integer.toString(sqr) + "\n";
            } else {
                squareOutput = squareOutput + Integer.toString(sqr);

            }

        }
        return stringOutput + squareOutput ;
    }


    public String random4() {
        String stringOutput = "*** Output ***\n" + " squares()\n";
        String random4Output = "";

        Random rand = new Random();
        int n = rand.nextInt(10) + 1;

        return  stringOutput + random4Output;}



    public String even(int n) {

        String stringOutput = "*** Output ***\n" + " even()";

        String evenOutput = "";

        for (int i = 1; i < n; i++) {
            if (i % 2 == 0) {
                evenOutput = evenOutput + "\n" + i;
            }
        }
        return stringOutput + evenOutput;
    }

        public void main(String[] args) {

            Numbers num = new Numbers();

            num.oneToTen();
            num.oddNumbers();
            num.squares();
            num.even(20);
        }


}
