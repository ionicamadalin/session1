package org.madalin.ierarhie3;

public abstract class DispozitivDeComunicare {
    private final String culoare;
    private final double dimensiune;
    private final boolean portabilitate;
    private final double capacitateDb;

    public DispozitivDeComunicare(String culoare, double dimensiune, boolean portabilitate, double capacitateDb) {

        this.culoare = culoare;
        this.dimensiune = dimensiune;
        this.portabilitate = portabilitate;
        this.capacitateDb = capacitateDb;
    }
    public String getCuloare() {
        return culoare;
    }

    public double getDimensiune() {
        return dimensiune;
    }

    public boolean isPortabilitate() {
        return portabilitate;
    }

    protected boolean esteElectric(){return true;}

    public int getCapacitateDb() {
        return (int) capacitateDb;
    }
}
