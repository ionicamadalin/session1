package org.madalin.ierarhie3;

public class DispozitivDeComunicareMecanic extends DispozitivDeComunicare {


    public DispozitivDeComunicareMecanic(String culoare, double dimensiune, boolean portabilitate, double capacitateDb) {
        super(culoare, dimensiune, portabilitate, capacitateDb);
    }

    protected boolean esteElectric()
    {
        return false;
    }


}
