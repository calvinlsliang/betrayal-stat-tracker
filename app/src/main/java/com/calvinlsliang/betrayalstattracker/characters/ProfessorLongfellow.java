package com.calvinlsliang.betrayalstattracker.characters;

public class ProfessorLongfellow extends BetrayalCharacter {
    public ProfessorLongfellow() {
        this.might = new String[] {"1", "2", "3", "4", "5", "5", "6", "6"};
        this.speed = new String[] {"2", "2", "4", "4", "5", "5", "6", "6"};
        this.sanity = new String[] {"1", "3", "3", "4", "5", "5", "6", "7"};
        this.knowledge = new String[] {"4", "5", "5", "5", "5", "6", "7", "8"};

        this.startingMightIndex = 2;
        this.startingSpeedIndex = 3;
        this.startingSanityIndex = 2;
        this.startingKnowledgeIndex = 4;

        this.birthday = "July 27th";
    }
}
