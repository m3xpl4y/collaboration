package com.company.project.viergewinnt;


public class main {

    static int hight = 6;
    static int lenght = 7;
    static char[][] field4IsWin = new char[hight][lenght];


    static char player1 = 'X';
    static char player2 = '0';
    static char player = 'X';


    public static void main(String[] args) {


        boolean isPlayEnd = true;

        mainClass.fielAllRowsWithSpace();



        while (isPlayEnd) {

            System.out.println("Bitte geben geben Sie die Spalte ein: 1-7. ");


            //System.out.println(mainClass.playstone());

            //Gibt das 4 Gewinnt GUI aus.



            mainClass.anyCollumISFull();



            main.outputResult(mainClass.fillRows(player));
            mainClass.findTheWinner();
            mainClass.changPlayer(player);



        }


    }
        //output for startGUi and output after every new input of a playstone.

    public static void outputResult(char[][] field) {
        System.out.println("|1|2|3|4|5|6|7|");
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
