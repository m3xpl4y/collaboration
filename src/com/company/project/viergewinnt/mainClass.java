package com.company.project.viergewinnt;


import java.util.Scanner;
import java.util.stream.IntStream;

public class mainClass {

    static int k[] = new int[main.lenght];
    static String solution = "";
    static boolean winning = false;


    //input form the player to check in with collum the playstone will be entered and decrase it by one for the right index 1 = 0.

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
    //Fill the Array with the given playstone and check if no other is on this place.

    public static char[][] fillRows(char player) {


        anyCollumISFull();


        for (int j = 0; j < main.hight; j++) {

            int i = playstone();
            System.out.println("Ausgabe Fill Rows: " + i);


            if (main.field4IsWin[j][i] == player) {
                System.out.println("Schon vorhanden.");

                k[i] += 1;

                main.field4IsWin[j + k[i]][i] = player;


                break;

            }
            if (main.field4IsWin[j][i] == ' ') {

                System.out.println("ist Leer");
                main.field4IsWin[j][i] = player;
                break;
            }


            if (main.field4IsWin[j][i] != player) {

                System.out.println("ist nicht der Spieler");
                k[i] += 1;
                main.field4IsWin[j + k[i]][i] = player;
                break;
            }


        }

        return main.field4IsWin;


    }
    //Change the Player after every input of the other player.

    public static void changPlayer(char player) {
        if (player == 'X') {
            System.out.println("Der Spieler 1 (0) ist dran.");
            //main.outputResult(mainClass.fillRows(player));


            main.player = '0';

        }
        if (player == '0') {
            System.out.println("Der Spieler 2 (X) ist dran.");
            //main.outputResult(mainClass.fillRows(player));

            main.player = 'X';

        }

        //return  player;
    }


    // Fiell the games GUI with the given Space.

    public static void fielAllRowsWithSpace() {

        for (int i = 0; i < main.hight; i++) {

            for (int j = 0; j < main.lenght; j++) {


                main.field4IsWin[i][j] = ' ';

            }


        }

    }

    public static void anyCollumISFull() {

        //check if any Collum is filled with 6 playstones.

        if (IntStream.of(k).anyMatch(x -> x == 5)) {
            System.out.println("Spiel vorbei");
        }
    }


    public static void findTheWinner() {



        horizontal();
        vertical();
        diagonally();





    }


    public static void horizontal() {

        for (int j = 0; j < main.lenght; j++) {


            for (int i = 0; i < main.hight; i++) {

                solution = solution + main.field4IsWin[i][j];

            }
            if (solution.indexOf("XXXX") != -1 ? true : false || solution.indexOf("0000") != -1 ? true : false) {
                System.out.printf("Es wurden 4x %c in der Spalte: %d eingegeben\n", main.player, (j + 1));
                winning = true;
                break;
            }

        }
        solution = "";



    }

    public static void vertical() {


        for (int j = 0; j < main.hight; j++) {


            for (int i= 0; i < main.lenght; i++) {

                solution = solution + main.field4IsWin[j][i];

            }
            if (solution.indexOf("XXXX") != -1 ? true : false || solution.indexOf("0000") != -1 ? true : false) {
                System.out.printf("Es wurden 4x %c in der Reihe: %d eingegeben\n", main.player, (j + 1));
                winning = true;
                break;
            }

        }
        solution = "";



    }

    public static void diagonally() {


        for (int j = 0; j < main.hight; j++) {


            for (int i= 0; i < main.lenght; i++) {

                solution = solution + main.field4IsWin[j][i];

            }
            if (solution.indexOf("XXXX") != -1 ? true : false || solution.indexOf("0000") != -1 ? true : false) {
                System.out.printf("Es wurden 4x %c in der Reihe: %d eingegeben\n", main.player, (j + 1));
                winning = true;
                break;
            }

        }
        solution = "";



    }


}



