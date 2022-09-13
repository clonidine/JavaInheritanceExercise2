package entities;

public final class Individual extends Payer {

    private final double healthExpenditures;


    public Individual(String name, Double anualIncome, double healthExpenditures) {
        super(name, anualIncome);
        this.healthExpenditures = healthExpenditures;
    }

    @Override
    public double tax() {
        double tax = 0.0;

        if (getAnualIncome() >= 20000.00 && healthExpenditures > 0) {
            tax = (getAnualIncome() * 25 / 100) - (healthExpenditures * 50 / 100);
        }

        else if (getAnualIncome() >= 20000.00 && healthExpenditures <= 0) {
            tax = getAnualIncome() * 25 / 100;
        }

        else if (getAnualIncome() <= 20000.00 && healthExpenditures > 0) {
            tax = (getAnualIncome() * 15 / 100) - (healthExpenditures * 50 / 100);
        }

        else if (getAnualIncome() <= 20000.00 && healthExpenditures <= 0) {
            tax = getAnualIncome() * 15 / 100;
        }

        return tax;
    }
}
