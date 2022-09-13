package entities;

public abstract class Payer {

    private final String name;
    private final Double anualIncome;

    public Payer(String name, Double anualIncome) {
        this.name = name;
        this.anualIncome = anualIncome;
    }

    public String getName() {
        return name;
    }

    public Double getAnualIncome() {
        return anualIncome;
    }

    public abstract double tax();
}
