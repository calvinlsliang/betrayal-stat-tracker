package com.calvinlsliang.betrayalstattracker.characters;

public abstract class BetrayalCharacter {

    protected String[] might;
    protected String[] speed;
    protected String[] sanity;
    protected String[] knowledge;

    protected int startingMightIndex;
    protected int startingSpeedIndex;
    protected int startingSanityIndex;
    protected int startingKnowledgeIndex;

    protected String birthday;

    public String[] getKnowledge() {
        return knowledge;
    }

    public String[] getMight() {
        return might;
    }

    public String[] getSanity() {
        return sanity;
    }

    public String[] getSpeed() {
        return speed;
    }

    public int getStartingKnowledgeIndex() {
        return startingKnowledgeIndex;
    }

    public int getStartingMightIndex() {
        return startingMightIndex;
    }

    public int getStartingSanityIndex() {
        return startingSanityIndex;
    }

    public int getStartingSpeedIndex() {
        return startingSpeedIndex;
    }

    public String getBirthday() {
        return birthday;
    }
}
