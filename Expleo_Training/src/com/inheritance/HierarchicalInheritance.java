package com.inheritance;

class CricketPlayer {

    String playerName;
    String teamName;

    void setPlayerData(String playerName, String teamName) {
        this.playerName = playerName;
        this.teamName = teamName;
    }

    void displayPlayerData() {
        System.out.println("Player Name: " + playerName);
        System.out.println("Team Name: " + teamName);
    }
}

class Batsman extends CricketPlayer {

    int hScore;
    float batAvg;

    void setBatsmanData(int hScore, float batAvg) {
        this.hScore = hScore;
        this.batAvg = batAvg;
    }

    void displayBatsmanData() {
        System.out.println("Highest Score: " + hScore);
        System.out.println("Batting Average: " + batAvg);
    }
}

class Bowler extends CricketPlayer {

    int wickets;
    float bowlAvg;

    void setBowlerData(int wickets, float bowlAvg) {
        this.wickets = wickets;
        this.bowlAvg = bowlAvg;
    }

    void displayBowlerData() {
        System.out.println("No. of Wickets: " + wickets);
        System.out.println("Bowling Average: " + bowlAvg);
    }
}

public class HierarchicalInheritance {

    public static void main(String[] args) {

        Batsman batsman = new Batsman();
        Bowler bowler = new Bowler();

        batsman.setPlayerData("Sachin", "India");
        batsman.setBatsmanData(200, 84.5f);

        bowler.setPlayerData("Bumrah", "India");
        bowler.setBowlerData(140, 6.75f);

        System.out.println("----- Batsman Details -----");
        batsman.displayPlayerData();
        batsman.displayBatsmanData();

        System.out.println();

        System.out.println("----- Bowler Details -----");
        bowler.displayPlayerData();
        bowler.displayBowlerData();
    }
}