package com.calvinlsliang.betrayalstattracker.characters;

public class DarrinFlashWilliams extends BetrayalCharacter {
    public DarrinFlashWilliams() {
        this.might = new String[] {"2", "3", "3", "4", "5", "6", "6", "7"};
        this.speed = new String[] {"4", "4", "4", "5", "6", "7", "7", "8"};
        this.sanity = new String[] {"1", "2", "3", "4", "5", "5", "5", "7"};
        this.knowledge = new String[] {"2", "3", "3", "4", "5", "5", "5", "7"};

        this.startingMightIndex = 2;
        this.startingSpeedIndex = 4;
        this.startingSanityIndex = 2;
        this.startingKnowledgeIndex = 2;

        this.birthday = "June 6th";
    }
}
