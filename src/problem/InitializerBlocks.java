package problem;

import java.util.Random;

public class InitializerBlocks {
    double d;

    {
        System.out.println("\nIn an instance intializer block-1");
        d = calculateD();
    }

    int l;

    {
        long l = 5;
        System.out.println("\nIn an instance intializer block-2");
        Random random = new Random();
        l = random.nextLong();
        this.l = (int) (Math.abs(l) % 100);
    }

    static int i;

    static {
        System.out.println("In a static initializer block.");
        double d = Math.random();
        int i;
        if (d < 0.5) {
            i = 5;
        } else
            i = 10;
        InitializerBlocks.i = i;
    }

    static int[] ints = new int[5];

    static {
        System.out.println("\nInitializing the static array");
        for (int i = 0; i < ints.length; i++) {
            ints[i] = (i + 1) * 10;
        }
    }

    String s;

    {
        s = new String("Javaaa!");
    }

    double calculateD() {
        return Math.random() * 10;
    }

    void printInfo(){
        System.out.println("\nVariables : ");
        System.out.println("d : " + d);
        System.out.println("l : " + l);
        System.out.println("i : " + i);
        System.out.println("\n Arrau");
        for(int i : ints)
            System.out.println(i + " ");
        System.out.println("ns : " + s);
    }

    public static void main(String[] args) { //Static blocks will be initialized even with empty main method
        new InitializerBlocks(); //After static block intializings, instance intializers will be initialized
        new InitializerBlocks();

    }
}
