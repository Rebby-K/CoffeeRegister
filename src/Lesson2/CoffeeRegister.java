package Lesson2;

import java.sql.SQLOutput;
import java.util.Scanner;

public class CoffeeRegister {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the number of cups:");
        int latteCount = scan.nextInt();
        System.out.println("Enter the price per cup:");
        double lattePrice = scan.nextDouble();
        System.out.println("Enter the price amount of tip:");
        double tip = scan.nextDouble();
        double total = latteCount * lattePrice + tip;
        System.out.println("Total: $" + total);

        //Research Findings:
        // double x = 5 is valid since double type includes both integers and numbers with decimals
        // int y = 5.5 si not valid because the int type is only for integers, and 5.5 is a decimal, so double should be used instead
        // Implicit casting (widening) is converting a smaller type to a larger type size
        // Explicit casting (narrowing) is converting a larger type to a smaller size type


        System.out.println("\n--- Experiment 1: Integer Division ---");
        System.out.print("How many cookies? ");
        int cookies = scan.nextInt();
        System.out.print("How many kids? ");
        int kids = scan.nextInt();

        int cookiesPerKid = cookies / kids;
        System.out.println("Each kid gets: " + cookiesPerKid + " cookies");

        //It doesn't show 2.333 because the type is int, which only shows integers.
        //To make it show decimals, we need to replace the int to double

        double cookiesPerKidPrecise = cookies / kids;
        System.out.println("Each kid gets: " + cookiesPerKidPrecise + " cookies");


        System.out.println("\n--- Experiment 2: Bonus Points ---");
        int loyaltyPoints = 10;

        System.out.println("Points: " + loyaltyPoints);
        loyaltyPoints += 5;
        //Add 5
        System.out.println("After bonus: " + loyaltyPoints);

        loyaltyPoints *= 2;
        //Double for weekend promo
        System.out.println("After promo: " + loyaltyPoints);

        int a = 5;
        int b = 5;
        int c = ++a;
        //Prefix = Increment THEN assign
        int d = b++;
        //Postfix = Assign THEN increment
        System.out.println("c = " + c + ", a = " + a);
        //c = 6, a = 6
        System.out.println("d = " + d + ", b = " + b);
        //d = 5, b = 6

        //The difference between prefix and postfix is:
        //Prefix - When ++ is added before the variable, a is being incremented and c is being assigned to the new value of a
        //Postfix - When ++ is added after the variable, b is being incremented and d is being assigned to the old value of b


        boolean isStudent = true;


        //Debug and Bug
        double itemPrice = 3.49;
        int quantity = 2;
        double subtotal = itemPrice * quantity;

        int roundedPrice = (int) subtotal;
        //BUG: Won't compile if (int) is not added; (int) will truncate the decimal
        System.out.println("Rounded total: " + roundedPrice);

        //The error is that java doesn't compile this code
        //The subtotal is a decimal
        //However, the roundedPrice is an integer type and is equal to the subtotal
        //Adding (int) before the subtotal it can make the subtotal into an integer
        //Therefore, the integer rounded price is now equal to integer subtotal, which is the subtotal rounded down

        //Difference between (int) 3.99 and Math.round(3.99):
        //(int) 3.99 truncates the decimal, so the output will be 3
        //Math.round(3.99) rounds the number mathematically, so 3.99 will be 4

        /*
        Reflection Questions:

        1. What happens when you store a double in an int? What is lost?
            - A compiler error will happen because the fraction/decimal part of the double will be lost
        2. Why does 5 / 2 dive us 2, not 2.5?
            - Because it is in the integer type and not double
        3. When would you use explicit casting? When is it automatic?
            - Used when the compiler cannot perform the conversion automatically
            - Explicit casting needs manual instruction and will never happen automatically
        4. What's one real-world situation where ++x vs x++ could cause a bug?
            - In a loop condition because they can change the value used
        5. What surprised you most about how Java handles numbers?
            - It requires very specific coding and casting is needed when you want different kind of results
         */
    }
}
