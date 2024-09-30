package diceGame;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to ProDiceGame.com \nPlayer name:");
        Scanner scan = new Scanner(System.in);
        String playerName = scan.nextLine();
        System.out.println("Opponent name:");
        String opponentName = scan.nextLine();
        Player newPlayer = new Player(playerName, 0, 0);
        Player newOpponent = new Player(opponentName, 0, 0);

        System.out.println("Press any button to roll dice "+newPlayer.getName());
        scan.nextLine();
        newPlayer.playerCalculate();
        newPlayer.playerCalculate();

        System.out.println("Press any button to roll dice "+newOpponent.getName());
        scan.nextLine();
        newOpponent.opponentCalculate();
        newOpponent.opponentCalculate();

        if (newPlayer.getPlayerSum() > newOpponent.getOpponentSum()) {
            System.out.println(newPlayer.getName()+" win");
        } else if (newPlayer.getPlayerSum() < newOpponent.getOpponentSum()) {
            System.out.println(newOpponent.getName()+" win");
        } else {
            System.out.println("Draw");
        }
    }
}