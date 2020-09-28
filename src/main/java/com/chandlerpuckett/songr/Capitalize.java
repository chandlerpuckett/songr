package com.chandlerpuckett.songr;

public class Capitalize {

    String str;

    public Capitalize(String str) {
        this.str = str.toUpperCase();
    }

//    ----- getters and setters -----
    public String getStr() {
        return str;
    }

    public void setStr(String str) {
        this.str = str;
    }
}
