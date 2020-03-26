package com.company;

import java.util.Comparator;

public class BceNawyNameComparator implements Comparator<BceNawy> {

    @Override
    public int compare(BceNawy a, BceNawy b) {
        return a.getName().compareTo(b.getName());
    }
}
