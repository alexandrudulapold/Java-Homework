package com.step.model.tehnica;

public class Microfon {
    String culoare;
    boolean integrat;
    boolean sunetOn;

    public void sunetSwitch() {
        if(sunetOn) {
            sunetOn = false;
        }
        else {
            sunetOn = true;
        }
    }
}
