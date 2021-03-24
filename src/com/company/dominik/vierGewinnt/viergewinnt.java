package com.company.dominik.vierGewinnt;
import java.util.Scanner;

public class viergewinnt {



    static int hight = 6;
    static int lenght = 7;

    static char player1 = 'X';
    static char player2 = '0';


    public static void main(String[] args) {


        boolean isPlayEnd = true;


        char[][] field4IsWin = new char[hight][lenght];


        while (true) {

            //System.out.println("Bitte geben geben Sie die Spalte ein: 1-7. ");


            //Ausgabe über Mehtoden.
            //System.out.println(vierGewinntClass.playstone());


            for (int ly = 5; ly < 0; ly--) {


                for (int lx = 6; lx < 0; lx--) {


                    if (player1 == 'X' && field4IsWin[ly][lx] != '0') {

                        field4IsWin[5][6] = 'X';

                    }


                    outputResult(field4IsWin);


                    isPlayEnd = false;

                }


            }

        }


    }

    //

    private static void outputResult(char[][] field) {
        for (int i = 0; i < hight; i++) {
            System.out.print("|");

            for (int j = 0; j < lenght; j++) {
                System.out.print(field[i][j]);
                System.out.print("|");

            }
            System.out.println("");

        }
    }

}
