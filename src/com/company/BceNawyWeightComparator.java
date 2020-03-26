package com.company;

import java.util.Comparator;

public class BceNawyWeightComparator implements Comparator<BceNawy> {
    @Override
    public int compare(BceNawy a, BceNawy b) {
        if(a.getWeight() < b.getWeight()){
            return 1;
        } else if(a.getWeight() > b.getWeight()) {
            return -1;
        }
         else
            return 0;
    }
}
