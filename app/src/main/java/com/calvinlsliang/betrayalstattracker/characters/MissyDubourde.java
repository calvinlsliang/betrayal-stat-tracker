package com.calvinlsliang.betrayalstattracker.characters;

public class MissyDubourde extends BetrayalCharacter {
    public MissyDubourde() {
        this.might = new String[] {"2", "3", "3", "3", "4", "5", "6", "7"};
        this.speed = new String[] {"3", "4", "5", "6", "6", "6", "7", "7"};
        this.sanity = new String[] {"1", "2", "3", "4", "5", "5", "6", "7"};
        this.knowledge = new String[] {"2", "3", "4", "4", "5", "6", "6", "6"};

        this.startingMightIndex = 3;
        this.startingSpeedIndex = 2;
        this.startingSanityIndex = 2;
        this.startingKnowledgeIndex = 3;

        this.birthday = "February 14th";
    }
}
