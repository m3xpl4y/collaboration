package com.company.project.viergewinnt;


public class main {

    static int hight = 6;
    static int lenght = 7;
    static char[][] field4IsWin = new char[hight][lenght];


    static char player1 = 'X';
    static char player2 = '0';
    static byte player = 0;


    public static void main(String[] args) {


        boolean isPlayEnd = true;

        mainClass.fielAllRows();


        while (isPlayEnd) {

            System.out.println("Bitte geben geben Sie die Spalte ein: 1-7. ");


            //System.out.println(mainClass.playstone());

            //Gibt das 4 Gewinnt GUI aus.

            mainClass.changPlayer(player);


        }


    }


    public static void outputResult(char[][] field) {
        for (int i = hight - 1; i >= 0; i--) {
            System.out.print("|");

            for (int j = 0; j <= lenght - 1; j++) {
                System.out.print(field[i][j]);
                System.out.print("|");

            }
            System.out.println("");

        }
    }


}
