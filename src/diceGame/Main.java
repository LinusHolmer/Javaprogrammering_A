package diceGame;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Välkommen till ProDiceGame.com \nNamn:" );
        String playerName = scan.nextLine();
        System.out.println("Motståndar namn:");
        String opponentName = scan.nextLine();
        Player newPlayer = new Player(playerName,0, 0);
        Player newOpponent = new Player(opponentName, 0,0);

        System.out.println("Välkommen "+newPlayer.getName());

        newPlayer.playerCalculate();
        newOpponent.opponentCalculate();

        if (newPlayer.getPlayerSum() > newOpponent.getOpponentSum()) {
            System.out.println("Du win");
        } else if (newPlayer.getPlayerSum() < newPlayer.getOpponentSum()) {
            System.out.println("Du förlora");
        } else {
            System.out.println("Oavgjort");
        }




    }
}
