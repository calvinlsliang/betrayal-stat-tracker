package com.calvinlsliang.betrayalstattracker.characters;

public class OxBellows extends BetrayalCharacter {
    public OxBellows() {
        this.might = new String[] {"4", "5", "5", "6", "6", "7", "8", "8"};
        this.speed = new String[] {"2", "2", "2", "3", "4", "5", "5", "6"};
        this.sanity = new String[] {"2", "2", "3", "4", "5", "5", "6", "7"};
        this.knowledge = new String[] {"2", "2", "3", "3", "5", "5", "6", "6"};

        this.startingMightIndex = 2;
        this.startingSpeedIndex = 4;
        this.startingSanityIndex = 2;
        this.startingKnowledgeIndex = 2;

        this.birthday = "October 18th";
    }
}
