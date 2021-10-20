// <David Kaneer>, AP CSA Unit 1 Challenge, Andrew Jackson High School, <10/20/2021>, <8:23>, v2.0

import java.util.Scanner;

public class DamageDealt {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        System.out.println("How many attacks would you like to make?");
        System.out.println(" ");
        int amountOfAttacksMade = myScanner.nextLine();
        System.out.println("How much damage will each attack do?");
        double damagePerAttack = myScanner.nextLine();
        System.out.println("What weapon are you using?");
        String weaponType = myScanner.nextLine();
        System.out.println("What Enemy are you attacking?");
        String enemyType = myScanner.nextLine();
    }
}