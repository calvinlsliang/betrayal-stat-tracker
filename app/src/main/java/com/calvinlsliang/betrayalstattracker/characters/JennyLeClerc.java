package com.calvinlsliang.betrayalstattracker.characters;

public class JennyLeClerc extends BetrayalCharacter {
    public JennyLeClerc() {
        this.might = new String[] {"3", "4", "4", "4", "4", "5", "6", "8"};
        this.speed = new String[] {"2", "3", "4", "4", "4", "5", "6", "8"};
        this.sanity = new String[] {"1", "1", "2", "4", "4", "4", "5", "6"};
        this.knowledge = new String[] {"2", "3", "3", "4", "4", "5", "6", "8"};

        this.startingMightIndex = 2;
        this.startingSpeedIndex = 3;
        this.startingSanityIndex = 4;
        this.startingKnowledgeIndex = 2;

        this.birthday = "March 4th";
    }
}
