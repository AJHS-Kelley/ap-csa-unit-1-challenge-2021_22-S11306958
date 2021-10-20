// <David Kaneer>, AP CSA Unit 1 Challenge, Andrew Jackson High School, <10/20/2021>, <9:12>, v3.0

import java.util.Scanner;

public class DamageDealt {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        System.out.println("What weapon are you using?");
        String weaponType = myScanner.nextLine();

        System.out.println("How many attacks would you like to make?");
        int amountOfAttacksMade = myScanner.nextInt();

        System.out.println("How much damage will each attack do?");
        double damagePerAttack = myScanner.nextDouble();

        System.out.println("What Enemy are you attacking?");
        String enemyType = myScanner.nextLine();

        double damageDealt = amountOfAttacksMade * damagePerAttack;
        double dps = damageDealt / 4;
        System.out.println("You dealt " + damageDealt + " to the " + enemyType + " with your " + weaponType
                + ". Your dps was " + dps);
    }
}