import java.util.Scanner;
public class OrderedIntegers {
    public static void main(String[] args) {

    Scanner scanner = new Scanner (System.in);
    System.out.println("Order Three Integers ===========");

    //prompt user for 3 integers
    System.out.println("Enter three integers: ");
    int num1 = scanner.nextInt();
    int num2 = scanner.nextInt();
    int num3 = scanner.nextInt();

    //Using if-else statements to arrange the integers in descending order
        if (num1 >= num2 && num1 >= num3) {
            if (num2 >= num3) {
                System.out.println("The integers in decreasing order are: " + num1 + ", " + num2 + ", " + num3);
            } else {
                System.out.println("The integers in decreasing order are: " + num1 + ", " + num3 + ", " + num2);
            }
        } else if (num2 >= num1 && num2 >= num3) {
            if (num1 >= num3) {
                System.out.println("The integers in decreasing order are: " + num2 + ", " + num1 + ", " + num3);
            } else {
                System.out.println("The integers in decreasing order are: " + num2 + ", " + num3 + ", " + num1);
            }
        } else {
            if (num1 >= num2) {
                System.out.println("The integers in decreasing order are: " + num3 + ", " + num1 + ", " + num2);
            } else {
                System.out.println("The integers in decreasing order are: " + num3 + ", " + num2 + ", " + num1);
            }
        }

    }
}
