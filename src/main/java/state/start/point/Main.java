package state.start.point;

import state.radio_player.Player;

import java.util.Scanner;

public class Main {
    private static Player player = new Player();

    public static void main(String[] args) {

        while(true){
            System.out.println("Player is " + player.getState().getClass().getSimpleName());
            showOptions();
            optionChooser(Integer.parseInt(new Scanner(System.in).nextLine()));
        }
    }

    private static void optionChooser(int option){
        switch (option){
            case 1:
                player.clickLock();
                break;
            case 2:
                player.clickPlay();
                break;
            case 3:
                player.clickStop();
                break;
            case 4:
                player.nextSong();
                break;
            case 5:
                player.previousSong();
                break;
        }
    }

    private static void showOptions(){
        System.out.println("" +
                "1 - Click lock button\n" +
                "2 - Click play button\n" +
                "3 - Click stop button\n" +
                "4 - Click next song\n" +
                "5 - Click previous song\n");
    }
}
