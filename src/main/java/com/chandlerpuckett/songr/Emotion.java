package com.chandlerpuckett.songr;

public class Emotion {

    String feeling;
    String person;
    String reason;
    boolean laugh;
    int level;

    public Emotion(String feeling, String person, String reason, boolean laugh, int level) {
        this.feeling = feeling;
        this.person = person;
        this.reason = reason;
        this.laugh = laugh;
        this.level = level;
    }

//    ----- getters and setters -----
    public String getFeeling() {
        return feeling;
    }

    public void setFeeling(String feeling) {
        this.feeling = feeling;
    }

    public String getPerson() {
        return person;
    }

    public void setPerson(String person) {
        this.person = person;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public boolean isLaugh() {
        return laugh;
    }

    public void setLaugh(boolean laugh) {
        this.laugh = laugh;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }
}
