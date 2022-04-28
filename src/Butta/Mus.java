package Butta;

public class Mus {
    private String pels;
    private String navn;
    private int alder;
    private int antallBein;

    /**
     * gå
     * løpe
     * spise
     */

    public Mus(String pels, String navn, int alder, int antallBein) {
        this.pels = pels;
        this.navn = navn;
        this.alder = alder;
        this.antallBein = antallBein;
    }

    /**
     * METHODS
     *
     */
        public void walk() {
            System.out.println(this.getNavn() + " starts walking");
        }

    /**
     * Getters And Setters
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
