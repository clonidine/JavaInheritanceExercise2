import entities.Company;
import entities.Individual;
import entities.Payer;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        List<Payer> payers = new ArrayList<>();

        System.out.print("Enter the number of tax payers: ");
        int numberOfPayers = sc.nextInt();

        for (int i = 0; i < numberOfPayers; i++) {
            System.out.printf("\nTax payer #%d data:\n\n", (i + 1));

            System.out.print("Individual or company (i/c)? ");
            char typeOfPayer = sc.next().charAt(0);

            if (typeOfPayer == 'i') {
                sc.nextLine();

                System.out.print("Name: ");
                String name = sc.nextLine();

                System.out.print("Anual income: ");
                double anualIncome = sc.nextDouble();

                System.out.print("Health expenditures: ");
                double healthExpenditures = sc.nextDouble();

                Payer payer = new Individual(name, anualIncome, healthExpenditures);
                payers.add(payer);
            }

            else {
                sc.nextLine();

                System.out.print("Name: ");
                String name = sc.nextLine();

                System.out.print("Anual income: ");
                double anualIncome = sc.nextDouble();

                System.out.print("Number of employees: ");
                int employeeNumber = sc.nextInt();

                Payer payer = new Company(name, anualIncome, employeeNumber);
                payers.add(payer);
            }
        }
        System.out.println("\nTAXES PAID:");

        for (Payer payer : payers) {
            System.out.println(payer.getName() + ": $ " + String.format("%.2f", payer.tax()));
        }

        double total = 0.0;

        for (Payer payer : payers) {

            total += payer.tax();
        }

        System.out.print("\nTOTAL TAXES: $ " + String.format("%.2f", total));
    }
}
