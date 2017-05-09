package io.zipcoder.microlabs.mastering_loops;

import java.util.Random;

public class Numbers {


    private String n;

    public String oneToTen() {

        String stringOutput = "*** Output ***\n" + " oneToTen()";

        for (int i = 1; i <= 10; i++) {

            stringOutput = stringOutput + "\n" + i;

        }
        return stringOutput;
    }

    public String oddNumbers() {

        String stringOutput = "*** Output ***\n" + " oddNumbers()";

        for (int j = 1; j <= 20; j++) {
            if (j % 2 == 1 && j < 19) {
                stringOutput = stringOutput + "\n" + j;
            }
        }
        return stringOutput;
    }

    public String squares() {

        String stringOutput = "*** Output ***\n" + " squares()";

        int k = 1;
        while (k <= 10) {
            int sqr = k * k;
            k++;
            {
                stringOutput = stringOutput + "\n" + sqr;
            }
        }
        return stringOutput;
    }


    public String random4() {
        String stringOutput = "*** Output ***\n" + " squares()\n";
        String random4Output = "";

        Random rand = new Random();
        int n = rand.nextInt(10) + 1;

        return stringOutput + random4Output;
    }


    public String even(int n) {

        String stringOutput = "*** Output ***\n" + " even()";

        for (int i = 1; i < n; i++) {
            if (i % 2 == 0) {
                stringOutput = stringOutput + "\n" + i;
            }
        }
        return stringOutput;
    }

    public String powers(int n) {
        String stringOutput = "*** Output ***\n" + " powers()";

        for (int i = 1; i <= n; i++) {
            stringOutput = stringOutput + "\n" + (int) Math.pow(2, i);
        }
        return stringOutput;
    }


    public void main(String[] args) {

        Numbers num = new Numbers();

        num.oneToTen();
        num.oddNumbers();
        num.squares();
        num.even(20);
    }


}
