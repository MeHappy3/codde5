package ex;

public class Masina extends Automobil{
    private double pret;
    private String model;

    public Masina(String firma, Combustibil combustibil, double pret, String model) {
        super(firma, combustibil);
        this.pret = pret;
        this.model = model;
    }

    public void setPret(double pret) {
        this.pret = pret;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getPret() {
        return pret;
    }

    public String getModel() {
        return model;
    }

    @Override
    public String toString() {
        return super.toString() +" "+this.pret+ " "+ this.model;
    }
}
