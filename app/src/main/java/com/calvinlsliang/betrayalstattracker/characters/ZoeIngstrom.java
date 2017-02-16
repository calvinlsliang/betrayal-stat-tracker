package com.calvinlsliang.betrayalstattracker.characters;

public class ZoeIngstrom extends BetrayalCharacter {
    public ZoeIngstrom() {
        this.might = new String[] {"2", "2", "3", "3", "4", "4", "6", "7"};
        this.speed = new String[] {"4", "4", "4", "4", "5", "6", "8", "8"};
        this.sanity = new String[] {"3", "4", "5", "5", "6", "6", "7", "8"};
        this.knowledge = new String[] {"1", "2", "3", "4", "4", "5", "5", "5"};

        this.startingMightIndex = 3;
        this.startingSpeedIndex = 3;
        this.startingSanityIndex = 2;
        this.startingKnowledgeIndex = 2;

        this.birthday = "November 5th";
    }
}
