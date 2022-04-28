package Butta;

public class Genser {
    private double pris;
    private String color;

    public Genser(double prisIn, String color) {
        pris = prisIn;
        this.color = color;
    }

    public double getPris() {
        return pris;
    }

    public void setPris(double pris) {
        this.pris = pris;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}

