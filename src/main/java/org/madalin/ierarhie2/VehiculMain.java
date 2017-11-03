package org.madalin.ierarhie2;

public class VehiculMain {
    public static void main(String[] args) {
        Vehicul vehicul=new Drona(Culoare.GALBEN.getCod(),0,50);
        System.out.print(vehicul);

        vehicul = new Trotineta(Culoare.VERDE.getCod());
        System.out.print(vehicul);

        vehicul = new Vehicul(Culoare.ROSU.getCod(),0,50) {
            @Override
            protected boolean areMotor() {
                return true;
            }

            @Override
            public TipTransport tipTransport() {
                return TipTransport.APA;
            }
        };
        System.out.print(vehicul);
    }
}
