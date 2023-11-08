package ex;

import java.time.LocalDate;

public class Motocicleta extends Automobil{
    private LocalDate dataFabricarii;

    public Motocicleta(String firma, Combustibil combustibil, LocalDate dataFabricarii) {
        super(firma, combustibil);
        this.dataFabricarii = dataFabricarii;
    }

    public LocalDate getDataFabricarii() {
        return dataFabricarii;
    }

    public void setDataFabricarii(LocalDate dataFabricarii) {
        this.dataFabricarii = dataFabricarii;
    }

    @Override
    public String toString() {
        return super.toString() + " "+ this.dataFabricarii;
    }
}
