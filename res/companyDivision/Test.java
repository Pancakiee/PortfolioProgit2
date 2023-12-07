/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fin3busongan_d;

/**
 *
 * @author busongan_d
 */

public class Test {
    public static void main(String[] args) {
        InternationalBranch internationalBranch1 = new InternationalBranch("Bank of America", 8767, "United States", "English");
        InternationalBranch internationalBranch2 = new InternationalBranch("JP Morgan Chase Bank", 1225, "Germany", "German");

        LocalBranch localBranch1 = new LocalBranch("UnionBank of the Philippines", 55461, "Makati");
        LocalBranch localBranch2 = new LocalBranch("Bangko Kabayan, Inc", 45844, "Pasig");

        System.out.println("International Branch 1:");
        internationalBranch1.display();

        System.out.println("\nInternational Branch 2:");
        internationalBranch2.display();

        System.out.println("\nLocal Branch 1:");
        localBranch1.display();

        System.out.println("\nLocal Branch 2:");
        localBranch2.display();
    }
}

