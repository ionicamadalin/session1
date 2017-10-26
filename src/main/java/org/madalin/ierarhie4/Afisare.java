package org.madalin.ierarhie4;

public class Afisare{
    public static void main(String[] args) {
        Socotitoare s1= new Socotitoare();
        CalculatorMecanic c1 = new CalculatorMecanic();
         PC p1 =new PC();
        final double v = p1.calculeazaRadical(255);
        c1.mecaninism="Complex";
        c1.calculeazaMecanic();
        System.out.println(c1.mecaninism);

    }

}
