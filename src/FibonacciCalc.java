import java.util.HashMap;
import java.util.Map;

public class FibonacciCalc {
    long fibonacci = 1;
    public static void main(String[] args) {
        FibonacciCalc calcfibo = new FibonacciCalc();
        System.out.println(calcfibo.FibonacciRecursive(1));
        System.out.println(calcfibo.FibonacciRecursive(2));
        System.out.println(calcfibo.FibonacciRecursive(3));
        System.out.println(calcfibo.FibonacciRecursive(4));
        System.out.println(calcfibo.FibonacciRecursive(5));
        System.out.println(calcfibo.FibonacciRecursive(6));
        System.out.println(calcfibo.FibonacciRecursive(7));
        System.out.println(calcfibo.FibonacciRecursive(8));
        //System.out.println(calcfibo.FibonacciRecursive(100));

    }

    public long FibonacciRecursive(int n) {

        if(n < 2){
            fibonacci = n;
            return fibonacci;
        }
        else{
            fibonacci = FibonacciRecursive(n-1) + FibonacciRecursive(n-2);
            }
        return fibonacci;
    }


}


// Çar
//