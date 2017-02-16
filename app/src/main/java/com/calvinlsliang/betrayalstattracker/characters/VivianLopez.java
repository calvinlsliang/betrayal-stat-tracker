package com.calvinlsliang.betrayalstattracker.characters;

public class VivianLopez extends BetrayalCharacter {
    public VivianLopez() {
        this.might = new String[] {"2", "2", "2", "4", "4", "5", "6", "6"};
        this.speed = new String[] {"3", "4", "4", "4", "4", "6", "7", "8"};
        this.sanity = new String[] {"4", "4", "4", "5", "6", "7", "8", "8"};
        this.knowledge = new String[] {"4", "5", "5", "5", "5", "6", "6", "7"};

        this.startingMightIndex = 2;
        this.startingSpeedIndex = 3;
        this.startingSanityIndex = 2;
        this.startingKnowledgeIndex = 3;

        this.birthday = "January 11th";
    }
}
