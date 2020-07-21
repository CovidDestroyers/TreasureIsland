package com.treasureisland.world;
import com.treasureisland.TreasureIslandGameplay;

import java.util.Scanner;


public class RumDistillery implements Location{
    private final TreasureIslandGameplay player = TreasureIslandGameplay.getInstance();
    Scanner scanner = new Scanner(System.in);
    String input;


    @Override
    public String getLocationName() {
        return "Rum Distillery";
    }

    @Override
    public void talkToNPC(){
        System.out.println("You're talking to npc in rum distillery");
        player.storylineProgression("MasterBrewer.txt");
        player.playerClues.add("For the last occurrence, look under drum that gives men courage." + "\n"
        + "Speak the pirates favorite letter, your reward shall be even better");
    }

    @Override
    public void lookAroundLocation(){
        System.out.println("making vodka, weird");
        System.out.println("Hello " + player.getPlayerName());
        player.storylineProgression("RumDistilleryOpenCask.txt");
    }

    @Override
    public void investigateArea() {
        System.out.println("-- I am sure i will find something interesting here " +
                "\n-- " + player.getPlayerName() + " looked under the cask and found ....");
        System.out.println("Speak the answer");
        input = scanner.nextLine();
        if(input.equalsIgnoreCase("sea")){
            System.out.println("\n--- Numbers start to appear and........I see 9999 etched on the bottom.");
            player.playerClues.add("9999");
        }
        else{
            System.out.println("Nothing of interest here");
        }


    }


}
