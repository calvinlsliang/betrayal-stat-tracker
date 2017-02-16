package com.calvinlsliang.betrayalstattracker.characters;

public class PeterAkimoto extends BetrayalCharacter {
    public PeterAkimoto() {
        this.might = new String[] {"2", "3", "3", "4", "5", "5", "6", "8"};
        this.speed = new String[] {"3", "3", "3", "4", "6", "6", "7", "7"};
        this.sanity = new String[] {"3", "4", "4", "4", "5", "6", "6", "7"};
        this.knowledge = new String[] {"3", "4", "4", "5", "6", "7", "7", "8"};

        this.startingMightIndex = 2;
        this.startingSpeedIndex = 3;
        this.startingSanityIndex = 3;
        this.startingKnowledgeIndex = 2;

        this.birthday = "September 3rd";
    }
}
