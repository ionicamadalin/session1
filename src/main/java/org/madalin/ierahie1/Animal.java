package org.madalin.ierahie1;

import java.util.StringTokenizer;

public abstract class Animal {

    int inaltime;
    double varsta;
    String denumire_stiintifica;
    double greutate;


    protected void mananca() {

        System.out.println("Toate animalele pot manca");

    }

    public static void main(String[] args) {

        Mamifer m1 = new Mamifer();
        Elefant e1 = new Elefant();
        Leu l1 = new Leu();
        m1.seReproduce();
        m1.mananca();
        e1.mananca();
        e1.seReproduce();
        e1.aruncaApa();
        // m1.aruncaApa(); // am doar ca sa vad ca nu se poate...deoarece un elefant poate face tot ceea ce face mamifer, dar nu mamifer nu poate face tot ceea ce face un elefent

        l1.atacaAnimale();
        l1.seReproduce(); // deci leul a mostenit toate comportamentele mamiferelor, iar la randul sau mamiferul a mostenit toate comportamentele animalelor
    }

}
