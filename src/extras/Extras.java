package extras;

import java.util.Scanner;

public class Extras {

    public static void main(String[] args) {

        int pass = 0, fail = 0;
        int number = 0;
        int grade = 0;
        int average = 0, range = 0;
        int highest = 0;
        int lowest = 101;
        int set1 = 0, set2 = 0, set3 = 0, set4 = 0;

        Scanner input = new Scanner(System.in);

        System.out.println("Enter grade: ");
        grade = input.nextInt();

        while (grade < 101) {

            number++;

            while (grade > highest) {
                highest = grade;
            }
            while (grade < lowest) {
                lowest = grade;
            }

            average = average + grade;

            if ((grade >= 0) && (grade <= 29)) {
                set1++;
                fail++;
            }

            if ((grade >= 30) && (grade <= 39)) {
                set2++;
                fail++;
            }

            if ((grade >= 40) && (grade <= 69)) {
                set3++;
                pass++;
            }

            if ((grade >= 70) && (grade <= 100)) {
                set4++;
                pass++;
            }
            System.out.println("Enter grade: ");
            grade = input.nextInt();

        }

        System.out.println(" ");
        System.out.println("1 - 29: " + set1);
        System.out.println("30 - 39: " + set2);
        System.out.println("40 -  69: " + set3);
        System.out.println("70 - 100: " + set4);
        System.out.println(" ");

        System.out.println(" ");
        System.out.println(" ");
        System.out.print("0 - 29  ");
        System.out.print("30 - 39  ");
        System.out.print("40 - 69  ");
        System.out.println("70 - 100  ");

        for (int z = 0; z < number; z++) {

            if (z < set1) {
                System.out.print("  *   ");
            } else {
                System.out.print("      ");

            }
            if (z < set2) {
                System.out.print("     *   ");
            } else {
                System.out.print("         ");

            }
            if (z < set3) {
                System.out.print("     *   ");
            } else {
                System.out.print("         ");

            }
            if (z < set4) {
                System.out.println("     *   ");
            } else {
                System.out.println("         ");

            }

        }

        average = average / number;
        range = highest - lowest;
        System.out.println(" ");
        System.out.println("Total students: " + number);
        System.out.println("The range is: " + range);
        System.out.println("Number of students passing: " + pass);
        System.out.println("Number of students failing: " + fail);
        System.out.println("The average mark is: " + average);
        System.out.println("The highest is: " + highest);
        System.out.println("The lowest is: " + lowest);
    }

}
