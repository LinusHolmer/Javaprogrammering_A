package diceGame;

import java.util.Scanner;

public class Main {
    private static String playerName;
    private static String opponentName;

    public static void main(String[] args) {
        System.out.println("Welcome to ProDiceGame.com \nPlayer name:");
        Scanner scan = new Scanner(System.in);
        playerName = scan.nextLine();
        System.out.println("Opponent name:");
        opponentName = scan.nextLine();
        Player newPlayer = new Player(playerName, 0, 0);
        Player newOpponent = new Player(opponentName, 0, 0);

        System.out.println("Press any button to roll dice, "+newPlayer.getName());
        scan.nextLine();
        newPlayer.playerCalculate();
        newPlayer.playerCalculate();

        System.out.println("Press any button to roll dice, "+newOpponent.getName());
        scan.nextLine();
        newOpponent.opponentCalculate();
        newOpponent.opponentCalculate();

        if (newPlayer.getPlayerSum() > newOpponent.getOpponentSum()) {
            System.out.println(newPlayer.getName()+" wins!");
        } else if (newPlayer.getPlayerSum() < newOpponent.getOpponentSum()) {
            System.out.println(newOpponent.getName()+" wins!");
        } else {
            System.out.println("Draw");
        }
    }
    // Get-Methods
    public static String getPlayerName(){
        return playerName;
    }
    public static String getOpponentName(){
        return opponentName;
    }
}