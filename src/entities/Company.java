package entities;

public final class Company extends Payer {

    private final Integer employeeNumber;

    public Company(String name, Double anualIncome, Integer employeeNumber) {
        super(name, anualIncome);
        this.employeeNumber = employeeNumber;
    }

    @Override
    public double tax() {
        double tax = 0.0;

        if (employeeNumber > 10) {
            tax = getAnualIncome() * 14 / 100;
        }

        else {
            tax = getAnualIncome() * 16 / 100;
        }

        return tax;
    }
}
