package fin5busongan_d;

import java.util.Scanner;

public class TestInsurance {
    public static void main(String[] args) {
        Scanner scanner;
        scanner = new Scanner(System.in);

        System.out.print("Enter the type of insurance (Health or Life):");
        String insuranceType = scanner.nextLine();

        Insurance insurance;

        if (insuranceType.equalsIgnoreCase("Health")) {
            insurance = new Health();
        } else if (insuranceType.equalsIgnoreCase("Life")) {
            insurance = new Life();
        } else {
            System.out.println("Invalid insurance type entered.");
            return;
        }

        System.out.println("\nInsurance Details:");
        insurance.display();

        scanner.close();
    }
}