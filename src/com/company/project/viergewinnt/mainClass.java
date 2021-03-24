package com.company.project.viergewinnt;


import java.util.Scanner;

    public class mainClass {



// hallo mAXg
//Hallo Dominik
//hallo schon wieder ....



        public static int playstone1() {

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

