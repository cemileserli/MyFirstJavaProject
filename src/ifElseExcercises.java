import java.util.Scanner;

public class ifElseExcercises {
    public static void main(String[] args){


        Scanner reader = new Scanner(System.in);
        /*
        System.out.println("Enter the color of traffic light");
        String color = reader.nextLine();

        if (color.equalsIgnoreCase("red"))
            System.out.println("We are waiting");
        else if(color.equalsIgnoreCase("yellow")){
            System.out.println("Get Ready");
        }
        else if(color.equalsIgnoreCase("green")){
            System.out.println("Ready to across the street");
        }else {
            System.out.println("You are color blind mate");
        }
        */

/*        //Is it even or odd
        System.out.println("Enter the number");
        int number = reader.nextInt();
        if(number %2 ==0 ){
            System.out.println("Number is Odd");
        }else {
            System.out.println("Number is Even");
        }*/

        //Smallest Number
        System.out.println("Enter the first number");
        int n1 = reader.nextInt();
        System.out.println("Enter the second number");
        int n2 = reader.nextInt();
        System.out.println("Enter the third number");
        int n3 = reader.nextInt();
        int smallest = n1;
        if (n2<smallest)
            smallest=n2;
        if (n3<smallest)
            smallest=n3;
        System.out.println("Smallest number is " + smallest);
    }

}
