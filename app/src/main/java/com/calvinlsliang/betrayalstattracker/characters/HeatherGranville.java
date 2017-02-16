package com.calvinlsliang.betrayalstattracker.characters;

public class HeatherGranville extends BetrayalCharacter {
    public HeatherGranville() {
        this.might = new String[] {"3", "3", "3", "4", "5", "6", "7", "8"};
        this.speed = new String[] {"3", "3", "4", "5", "6", "6", "7", "8"};
        this.sanity = new String[] {"3", "3", "3", "4", "5", "6", "6", "6"};
        this.knowledge = new String[] {"2", "3", "3", "4", "5", "6", "7", "8"};

        this.startingMightIndex = 2;
        this.startingSpeedIndex = 2;
        this.startingSanityIndex = 2;
        this.startingKnowledgeIndex = 4;

        this.birthday = "August 2nd";
    }
}
