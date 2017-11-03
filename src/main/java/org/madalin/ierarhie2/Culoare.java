package org.madalin.ierarhie2;

public enum Culoare{
    ROSU(1), VERDE(2), GALBEN(3);

    Culoare(int cod) {
        this.cod = cod;
    }

    private int cod;

    public int getCod() {
        return cod;
    }

    public static Culoare get(int cod){
        for (Culoare culoare : values()) {
            if(culoare.getCod()==cod){
                return culoare;
            }
        }
        throw new RuntimeException("Cod de culoare negasit!!");
    }
}
