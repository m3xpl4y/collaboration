package com.company.project.viergewinnt;

import java.util.Scanner;

    public class mainClass {

        public static int playstone() {

            int inputstone = 0;

            boolean isValideNumber = true;

            while (isValideNumber) {

                Scanner scan = new Scanner(System.in);
                inputstone = scan.nextInt();

                if (inputstone >= 1 || inputstone <=7) {

                    inputstone--;

                    isValideNumber = false;

                    return inputstone;
                }
            }
            return inputstone;
        }

    }

