import java.util.Scanner;

public class UserInput {
    public static void main(String[] args){
        Scanner myScanner = new Scanner(System.in);

        System.out.println("Enter Number");
        /*
        int enteredNumber = myScanner.nextInt();
        System.out.println("You entered " + enteredNumber);
        */
        char enteredChar = myScanner.next().charAt(0);
        System.out.println("You entered " + enteredChar);
    }
}
