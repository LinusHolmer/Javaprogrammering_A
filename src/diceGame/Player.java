package diceGame;

import java.util.Random;

public class Player {
    private String name;
    private int playerSum;
    private int opponentSum;

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

    public void playerCalculate(){
        Random random = new Random();
        int playerNum1 = random.nextInt(6) + 1;
        System.out.println("Player got a "+playerNum1);
        setPlayerSum((playerNum1 + playerSum));

    }
    public void opponentCalculate(){
        Random random = new Random();
        int opponentNum1 = random.nextInt(6) + 1;
        System.out.println("Your opponent got a "+opponentNum1);
        setOpponentSum((opponentNum1 + opponentSum));
    }

}
