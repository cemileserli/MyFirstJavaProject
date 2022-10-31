import java.util.Scanner;

public class ScannerExecises {
    public static void main(String[] args){
/*
        Scanner reader = new Scanner(System.in);
        System.out.println("Enter the first number");
        int n1 = reader.nextInt();
        System.out.println("Enter the second number");
        int n2 = reader.nextInt();
        System.out.println("Enter the third number");
        int n3 = reader.nextInt();

        int sum = n1 + n2 + n3;
        int diff = n1 - n2 - n3;
        int product = n1 * n2 * n3;
        double average = sum / 3;
        System.out.println("The sum is equal to " + sum + " The difference is equal to " + diff + " The product is equal to " + product + " The average is equal to " + average);
*/

        //(50°C × 9/5) + 32 = 122°F

        Scanner reader = new Scanner(System.in);
        System.out.println("Enter the celsius value");
        double celsiusValue = reader.nextDouble();
        double fahreneitValue = ((celsiusValue * 9)/5) + 32;
        if (celsiusValue<20)
            System.out.println("It is cold mate");
        System.out.println("Celsius value : " + celsiusValue + " ::: Fahrenheit Value : " + fahreneitValue);


    }
}
