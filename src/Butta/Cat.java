package Butta;

import com.Streams.CustomerValidatorService;

public class Cat {
    /**
     * pels
     * navn
     * alder
     * antallBein
     *
     * Getters og setters på feltene
     *
     *
     */
    private String pels;
    private String navn;
    private int alder;
    private int antallBein;
    CustomerValidatorService validatorService;


    /**
     * Constructor for å lage objekt
     */
    public Cat(String pels, String navn, int alder, int antallBein) {
        this.pels = pels;
        this.navn = navn;
        this.alder = alder;
        this.antallBein = antallBein;

    }

    /**
     *
     *      * Methods
     *      *gå
     *      * male
     *      * spise
     *      * sitte
     *      * slåss
     *      *
     */
    public void gå() {
        System.out.println(this.getNavn() + " starts walking");
    }
    public void bite(Mus mus) {
        System.out.println(this.getNavn() + " " + " bites" + mus.getNavn());
    }




    /**
     *
     * GETTERS AND SETTERS
     */
    public String getPels() {
        return pels;
    }

    public void setPels(String pels) {
        this.pels = pels;
    }

    public String getNavn() {
        return navn;
    }

    public void setNavn(String navn) {
        this.navn = navn;
    }

    public int getAlder() {
        return alder;
    }

    public void setAlder(int alder) {
        this.alder = alder;
    }

    public int getAntallBein() {
        return antallBein;
    }

    public void setAntallBein(int antallBein) {
        this.antallBein = antallBein;
    }
}
