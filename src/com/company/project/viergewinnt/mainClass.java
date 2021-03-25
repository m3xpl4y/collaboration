package com.company.project.viergewinnt;


import java.util.Scanner;

public class mainClass {

static int k [] = new int[main.lenght];

    public static int playstone() {

        int inputstone = 0;

        boolean isValideNumber = true;

        while (isValideNumber) {

            Scanner scan = new Scanner(System.in);
            inputstone = scan.nextInt();

            if (inputstone >= 1 && inputstone <= 7) {

                inputstone--;

                isValideNumber = false;


                break;

            }


        }

        return inputstone;
    }


    public static char[][] fillRows(char player) {


        for (int j = 0; j < main.hight; j++) {

            int i = playstone();
            System.out.println("Ausgabe Fill Rows: " + i);


            if (main.field4IsWin[j][i] == player) {
                System.out.println("Schon vorhanden.");

                k []


                main.field4IsWin[j+k][i] = player;
                k++;


                break;

            }
            if (main.field4IsWin[j][i] != player) {
                main.field4IsWin[j][i] = player;
                break;
            }


        }

        return main.field4IsWin;


    }


}

