package org.madalin.ieharhie3;
import java.util.Scanner;
import java.io.FileInputStream;
public class Smartphone extends Telefon {

    @Override
    public void poateComunica() {
        System.out.println("Poate comunica la fel ca un telefon");
    }

    public void acceseazaInternet(){
        System.out.println("Orice smart poate accesa Internetul");

    }
}
