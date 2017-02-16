package com.calvinlsliang.betrayalstattracker.characters;

public class FatherRhinehardt extends BetrayalCharacter {
    public FatherRhinehardt() {
        this.might = new String[] {"1", "2", "2", "4", "4", "5", "5", "7"};
        this.speed = new String[] {"2", "3", "3", "4", "5", "6", "7", "7"};
        this.sanity = new String[] {"3", "4", "5", "5", "6", "7", "7", "8"};
        this.knowledge = new String[] {"1", "3", "3", "4", "5", "6", "6", "8"};

        this.startingMightIndex = 2;
        this.startingSpeedIndex = 2;
        this.startingSanityIndex = 4;
        this.startingKnowledgeIndex = 3;

        this.birthday = "April 29th";
    }
}
