package io.zipcoder.microlabs.mastering_loops;


public class Numbers {




    public String oneToTen(){

        System.out.print(  "oneToTen()\n");
        System.out.print(  " *** Output ***\n");

        for (int i=1; i<11; i++){

            System.out.println( i);
        }

        return "";
    }

    public String oddNumbers() {

        System.out.print("\noddNumbers()\n");
        System.out.print(" *** Output ***\n");

        for (int j = 1; j <= 20; j++) {
            if (j % 2 == 1) {
                System.out.println( j);
            }
        }
        return "";
    }

    public String squares(){

        System.out.print("\nsquares()\n");
        System.out.print(" *** Output ***\n");

        int sqr;
        int k = 1;
        while (k <= 10) {
            sqr  = (k*k);
            k++;
            System.out.println( sqr);
        }
        return "";
    }


    public String random4(){
        return "";
    }

    public String even(int n){
        return "";
    }

    public String powers(int n){
        return "";
    }

}
