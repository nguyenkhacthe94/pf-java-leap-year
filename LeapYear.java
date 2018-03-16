import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        boolean isLeapYear = false;
        System.out.println("Enter a year: ");
        int year = input.nextInt();
        boolean isDivisibleBy400 = year % 400 == 0;
        if (isDivisibleBy400) isLeapYear = true;
        else {
            boolean isDivisibleBy100 = year % 100 == 0;
            if (isDivisibleBy100) isLeapYear = false;
            else {
                boolean isDivisibleBy4 = year % 4 == 0;
                if (isDivisibleBy4) isLeapYear = true;
            }
        }
        if (isLeapYear) System.out.format("%d is a leap year", year);
        else System.out.format("%d is not a leap year", year);
    }
}