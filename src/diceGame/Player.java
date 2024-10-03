package diceGame;

import java.util.Random;

public class Player {
    private String name;
    private int playerSum;
    private int opponentSum;

    // Constructs
    public Player(String name, int playerSum, int opponentSum){
        this.name = name;
        this.playerSum = playerSum;
        this.opponentSum = opponentSum;
    }

    // Get-Methods
    public String getName() {
        return name;
    }

    public int getPlayerSum() {
        return playerSum;
    }

    public int getOpponentSum() {
        return opponentSum;
    }

    // Set-Methods
    public void setName(String name) {
        this.name = name;
    }

    public void setPlayerSum(int playerSum) {
        this.playerSum = playerSum;
    }

    public void setOpponentSum(int opponentSum) {
        this.opponentSum = opponentSum;
    }

    // Methods
    public void playerRoll(){
        Random random = new Random();
        int playerRoll1 = random.nextInt(6) + 1;
        System.out.println(Main.getPlayerName() +" got a "+playerRoll1);
        setPlayerSum((playerRoll1 + playerSum));

    }
    public void opponentRoll(){
        Random random = new Random();
        int opponentRoll1 = random.nextInt(6) + 1;
        System.out.println(Main.getOpponentName() +" got a "+opponentRoll1);
        setOpponentSum((opponentRoll1 + opponentSum));
    }

}
