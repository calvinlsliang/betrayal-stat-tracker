package com.calvinlsliang.betrayalstattracker.characters;

public class BrandonJaspers extends BetrayalCharacter {
    public BrandonJaspers() {
        this.might = new String[] {"2", "3", "3", "4", "5", "6", "6", "7"};
        this.speed = new String[] {"3", "4", "4", "4", "5", "6", "7", "8"};
        this.sanity = new String[] {"3", "3", "3", "4", "5", "6", "7", "8"};
        this.knowledge = new String[] {"1", "3", "3", "5", "5", "6", "6", "7"};

        this.startingMightIndex = 3;
        this.startingSpeedIndex = 2;
        this.startingSanityIndex = 3;
        this.startingKnowledgeIndex = 2;

        this.birthday = "May 21st";
    }
}
