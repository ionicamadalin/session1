package org.madalin.ierahie1;


import org.junit.Before;

public class AnimalTest {

    private Animal[] animals;

    @Before
    public void setUp() throws Exception {

        animals = new Animal[]{
                new Leu(4, Sex.M),
                new Crocodil(3,10),
                new Elefant(12, Sex.F)

        };
    }

    @org.junit.Test
    public void tipVedere() throws Exception {
        for (Animal animal : animals) {
            System.out.println(animal.getClass().getSimpleName()+" are vedere "+animal.tipVedere());
            System.out.println(animal.getClass().getSimpleName()+" se reproduce "+animal.seReproduce());
            boolean esteOReptila = animal instanceof Reptila;
            System.out.println(animal.getClass().getSimpleName() + " este o reptila "+ esteOReptila);
            if(esteOReptila){
                Reptila reptila= (Reptila) animal;
                System.out.println("Reptila "+reptila.getClass().getSimpleName()+" ");
            }
        }
    }


}
