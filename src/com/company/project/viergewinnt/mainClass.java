package com.company.project.viergewinnt;


import java.util.Scanner;
import java.util.stream.IntStream;

public class mainClass {

static int k [] = new int[main.lenght];


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

                main.field4IsWin[j+k[i]][i] = player;



                break;

            }
            if (main.field4IsWin[j][i] == ' ') {

                System.out.println("ist Leer");
                main.field4IsWin[j][i] = player;
                break;
            }


            if ( main.field4IsWin[j][i] != player) {

                System.out.println("ist nicht der Spieler");
                k[i] += 1;
                main.field4IsWin[j+k[i]][i] = player;
                break;
            }



        }

        return main.field4IsWin;






    }
        //Change the Player after every input of the other player.

    public static byte changPlayer(byte player) {
        if (player == 0 ) {
            System.out.println("Der Spieler 1 (X) ist dran.");
            main.outputResult(mainClass.fillRows('X'));


            player = 1;

        }
        if (player == 1) {
            System.out.println("Der Spieler 2 (0) ist dran.");
            main.outputResult(mainClass.fillRows('0'));

            player = 0;

        }

        return  player;
    }


    // Fiell the games GUI with the given playstones.

    public static void fielAllRows(){

        for (int i = 0; i < main.hight; i++) {

            for (int j = 0; j < main.lenght ; j++) {


                main.field4IsWin[i][j] = ' ';

            }



        }

    }

    public static void anyCollumISFull(){

        //check if any Collum is filled with 6 playstones.

        if (IntStream.of(k).anyMatch(x -> x == 5)) {
            System.out.println("Spiel vorbei");
        }
    }


}

