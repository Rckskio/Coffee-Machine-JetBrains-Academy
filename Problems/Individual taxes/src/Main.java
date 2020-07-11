import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberOfCompanies = scanner.nextInt();
        float[] companiesIncome = new float[numberOfCompanies];
        float[] taxes = new float[numberOfCompanies];

        for (int i = 0; i < companiesIncome.length; i++) {
            companiesIncome[i] = scanner.nextFloat();
        }
        for (int i = 0; i < taxes.length; i++) {
            taxes[i] = scanner.nextFloat();
        }

        float amountOfTaxes;
        float highestTax = 0;
        int companyMostPay = 0;

        for (int i = 0; i < companiesIncome.length; i++) {
            if (companiesIncome[i] != 0 && taxes[i] != 0) {
                amountOfTaxes = companiesIncome[i] * taxes[i] / 100;
                if (amountOfTaxes > highestTax) {
                    highestTax = amountOfTaxes;
                    companyMostPay = i;
                }
            }
        }

        System.out.println(companyMostPay + 1);
    }
}