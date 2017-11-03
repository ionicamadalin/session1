package org.madalin.ierarhie5;

public  class Tranzistor {
    
    protected String crtBaza;
    protected String crtEmitor;
    protected String crtColector;
    protected String tip;
    protected int numar;
    
    public Tranzistor(String crtBaza, String crtColector, String crtEmitor,int numar){
        this.crtBaza=crtBaza;
        this.crtColector=crtColector;
        this.crtEmitor=crtEmitor;
        this.numar=numar;

    }
    
    protected void asiguraStabilitate(){}
}
