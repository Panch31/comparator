package com.company;

import java.util.Comparator;

public class BceNawyWeightComparator implements Comparator<BceNawy> {
    @Override
    public int compare(BceNawy a, BceNawy b) {
        int result = a.getWeight() < b.getWeight() ? 1 : -1;
            return result;
    }
}
