package Butta;

import java.sql.SQLOutput;

public class PetStore {
    Cat cat;
    Mus mus;

    public PetStore(Cat cat, Mus mus) {
        this.cat = cat;
        this.mus = mus;
    }

    /*
        Methods;

     */

    /**
     * Getters & setters
     */
    public void scenario(Cat katt, Mus mus) {
        System.out.println("One day in the petStore " + katt.getNavn() + " " + "started a fight with " + mus.getNavn());
        katt.gå();
        mus.walk();
        katt.bite(mus);
    }

    public Cat getCat() {
        return cat;
    }

    public void setCat(Cat cat) {
        this.cat = cat;
    }

    public Mus getMus() {
        return mus;
    }

    public void setMus(Mus mus) {
        this.mus = mus;
    }
}
