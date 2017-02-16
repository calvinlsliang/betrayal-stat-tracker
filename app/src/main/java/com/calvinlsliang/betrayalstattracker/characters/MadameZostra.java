package com.calvinlsliang.betrayalstattracker.characters;

public class MadameZostra extends BetrayalCharacter {
    public MadameZostra() {
        this.might = new String[] {"2", "3", "3", "4", "5", "5", "5", "6"};
        this.speed = new String[] {"2", "3", "3", "5", "5", "6", "6", "7"};
        this.sanity = new String[] {"4", "4", "4", "5", "6", "7", "8", "8"};
        this.knowledge = new String[] {"1", "3", "4", "4", "4", "5", "6", "6"};

        this.startingMightIndex = 3;
        this.startingSpeedIndex = 2;
        this.startingSanityIndex = 2;
        this.startingKnowledgeIndex = 3;

        this.birthday = "December 10th";
    }
}
