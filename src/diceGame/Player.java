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
        System.out.println("Du fick en "+playerNum1);
        int playerNum2 = random.nextInt(6) + 1;
        System.out.println("Du fick en "+playerNum2);
        setPlayerSum((playerNum1 + playerNum2));

    }
    public void opponentCalculate(){
        Random random = new Random();
        int opponentNum1 = random.nextInt(6) + 1;
        System.out.println("Din motståndare fick en "+opponentNum1);
        int opponentNum2 = random.nextInt(6) + 1;
        System.out.println("Din motståndare fick en "+opponentNum2);
        setOpponentSum((opponentNum1 + opponentNum2));
    }

}
