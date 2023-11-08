package ex;

public class Automobil {
    private String firma;
    private Combustibil combustibil;

    public void setFirma(String firma) {
        this.firma = firma;
    }

    public void setCombustibil(Combustibil combustibil) {
        this.combustibil = combustibil;
    }

    public String getFirma() {
        return firma;
    }

    public Combustibil getCombustibil() {
        return combustibil;
    }

    public Automobil(String firma, Combustibil combustibil) {
        this.firma = firma;
        this.combustibil = combustibil;
    }

    @Override
    public String toString() {
        return this.firma+" "+this.combustibil;
    }
}
