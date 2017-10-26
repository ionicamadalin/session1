package org.madalin.ierahie1;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class LeuTest {
    Animal animal;
    @Before
    public void setUp() throws Exception {
        animal=new Leu(3,Sex.M);
    }

    @Test
    public void tipVedere() throws Exception {
        Assert.assertTrue(animal.tipVedere()==TipVedere.IN_FATA);
    }

    @Test
    public void getNrPicioare() throws Exception {
    }

    @Test
    public void seReproduce() throws Exception {
    }

    @Test
    public void esteCarnivor() throws Exception {
    }

    @Test
    public void tipVedere1() throws Exception {
    }

}