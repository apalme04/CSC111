import java.util.Scanner;
public class Zeller {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int dayOriginal;
        //prompt user for day, month, and year
        System.out.println("Enter the day: ");
        int day = scanner.nextInt();
        System.out.println("Enter the month: ");
        int month = scanner.nextInt();
        System.out.println("Enter the year: ");
        int year = scanner.nextInt();
        dayOriginal = day;

    if (month <= 2){
        year -= 1;
    }
    //change the value of the day according to the month
    if (month == 2) {
        day = day + 3;
    } else if (month == 3) {
        day = day + 2;
    } else if (month == 4) {
        day = day + 5;
    } else if (month == 6) {
        day = day + 3;
    } else if (month == 7) {
        day = day + 5;
    } else if (month == 8) {
        day = day + 1;
    } else if (month == 9) {
        day = day + 4;
    } else if (month == 10) {
        day = day + 6;
    } else if (month == 11) {
        day = day + 2;
    } else if (month == 12) {
        day = day + 4;
    }
    //Zeller equation
    int x = (day + year + (year / 4) - (year / 100) + (year / 400)) %7;

    //determine the day of the week
    String dayOfWeek = "Sunday";
    if (x == 0) {
        dayOfWeek = "Sunday";
    } else if (x == 1) {
        dayOfWeek = "Monday";
    } else if (x == 2) {
        dayOfWeek = "Tuesday";
    } else if (x == 3) {
        dayOfWeek = "Wednesday";
    } else if (x == 4) {
        dayOfWeek = "Thursday";
    } else if (x == 5) {
        dayOfWeek = "Friday";
    } else if (x == 6) {
        dayOfWeek = "Saturday";
    }

        System.out.println("Day of the week for " + month + "/" + dayOriginal + "/" + year + " is " + dayOfWeek);
    }
}
