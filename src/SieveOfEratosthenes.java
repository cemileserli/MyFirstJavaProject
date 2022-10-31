import java.util.Arrays;
import java.util.Scanner;

public class SieveOfEratosthenes {
    public static void main(String[] args) {
        SieveOfEratosthenes soe = new SieveOfEratosthenes();

        System.out.println("Please input a positive number to list prime numbers from 2 till the number you input.");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        soe.findPrimesInArray(n);
    }

    void findPrimesInArray(int n) {
        boolean[] array1 = new boolean[n+1];
        Arrays.fill(array1, true);


        System.out.println("All Prime numbers from 2 through " + n);

        int upperBound = (int) Math.sqrt(n);
        for (int i = 2; i <= upperBound; i++) {
            if(array1[i]) {
                for (int j = 2; i * j <= n; j++) {
                    array1[i * j] = false;
                }
            }
        }
        for (int i = 2; i <= n; i++) {
            if(array1[i]) {
                System.out.println(i);
            }
        }

    }
}
