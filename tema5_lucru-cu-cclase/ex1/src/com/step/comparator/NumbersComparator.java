package com.step.comparator;

public class NumbersComparator {

    public double nrMax(double nr1, double nr2) {
        if(nr1 > nr2) {
            return nr1;
        }
        else {
            return nr2;
        }
    }

    public double nrMin(double nr1, double nr2) {
        if(nr1 < nr2) {
            return nr1;
        }
        else {
            return nr2;
        }
    }

}
