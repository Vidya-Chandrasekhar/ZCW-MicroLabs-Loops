package io.zipcoder.microlabs.mastering_loops;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Numbers {


    public String oneToTen() {

        List<Integer> oneToTenList = new ArrayList<Integer>();
        for (int i = 1; i <= 10; i++) {
            oneToTenList.add(i);
        }
        return createOutput(oneToTenList, "oneToTen()");
    }

    public String oddNumbers() {

        List<Integer> oddNumbersList = new ArrayList<Integer>();

        for (int j = 1; j <= 20; j++) {
            if (j % 2 == 1) {
                oddNumbersList.add(j);
            }
        }
        return createOutput(oddNumbersList, "oddNumbers()");

    }

    public String squares() {
        List<Integer> squaresList = new ArrayList<Integer>();


        int k = 1;
        while (k <= 10) {
            int sqr = k * k;
            k++;
            {
                squaresList.add(sqr);
            }
        }
        return createOutput(squaresList, "squares()");

    }


    public String random4() {
        List<Integer> random4List = new ArrayList<Integer>();

        Random rand = new Random();
        for (int i = 1; i <= 4; i++) {
            int n = rand.nextInt(10) + 1;
            random4List.add(n);
        }
        return createOutput(random4List, "random4()");
    }


    public String even(int n) {

        List<Integer> evenList = new ArrayList<Integer>();

        for (int i = 1; i < n; i++) {
            if (i % 2 == 0) {
                evenList.add(i);
            }
        }
        return createOutput(evenList, "even()");
    }

    public String powers(int n) {
        List<Integer> powersList = new ArrayList<Integer>();

        String stringOutput = "*** Output ***\n" + " powers()";

        for (int i = 1; i <= n; i++) {
            powersList.add((int) Math.pow(2, i));
        }
        return createOutput(powersList, "powers()");


    }


    private String createOutput(List<Integer> numberList, String methodName) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("*** Output ***\n");
        stringBuilder.append(" "+ methodName);
        for (Integer num : numberList) {
            stringBuilder.append("\n" + num);
        }
        return stringBuilder.toString();
    }


    public static void main(String[] args) {

        Numbers num = new Numbers();

        num.oneToTen();
        num.oddNumbers();
        num.squares();
        num.even(20);
    }


}
