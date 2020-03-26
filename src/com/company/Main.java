package com.company;

import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Main {

    public static void main(String[] args) {
        Comparator<BceNawy> vcomp = new BceNawyWeightComparator().thenComparing(new BceNawyNameComparator());
        TreeSet<BceNawy> vceNawy = new TreeSet<BceNawy>(vcomp);
        vceNawy.add(new BceNawy("Petro", 78));
        vceNawy.add(new BceNawy("Vladik", 67));
        vceNawy.add(new BceNawy("Brat", 84));
        vceNawy.add(new BceNawy("Artem", 90));
        vceNawy.add(new BceNawy("Panch", 95));
        vceNawy.add(new BceNawy("Doctor", 27));
        vceNawy.add(new BceNawy("Skor", 67));

        for (BceNawy v : vceNawy){
            System.out.println(v.getName() + " " + v.getWeight());
        }
    }
}
