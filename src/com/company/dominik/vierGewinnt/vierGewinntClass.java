package com.company.dominik.vierGewinnt;

import java.util.Scanner;

public class vierGewinntClass {



    public static int playstone(){

        int inputstone = 0;

        boolean isValideNumber = true;

        while (isValideNumber) {

            Scanner scan = new Scanner(System.in);
            inputstone = scan.nextInt();

            if (inputstone >= 1 || inputstone <= 7) {

                inputstone--;

                isValideNumber = false;
                System.out.println("If input is between 1 and 6");

                return inputstone;
            }


        }

        return inputstone;
    }
}
