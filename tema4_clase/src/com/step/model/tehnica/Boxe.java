package com.step.model.tehnica;

public class Boxe {
    int maxDB;
    int currentDB;

    public void maresteSunet() {
        if(currentDB < maxDB) {
            currentDB++;
        }
    }
    public void MicsoreazaSunet() {
        if(currentDB > 0) {
            currentDB--;
        }
    }
}
