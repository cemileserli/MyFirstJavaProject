package problem;

import java.time.LocalTime;
import java.util.Random;

public class InitializationSolution {
    String name;
    double coefficient;
    static int ratio;

    {
        name = "default";
        LocalTime now = LocalTime.now();
        if(now.isBefore(LocalTime.NOON))
            coefficient = 2;
        else
            coefficient = 4;
    }

    static {
        Random random = new Random();
        int randomInt = random.nextInt();
        randomInt = Math.abs(randomInt);
        double randomDouble = Math.random();
        if(randomDouble < 0.5)
            ratio = randomInt % 9;
        else
            ratio = randomInt % 5;
    }

    InitializationSolution(){
    //    name = "default";
    }

    InitializationSolution(String name){
        this.name = name;
    }

    public static void main(String[] args) {
        System.out.println("ratio : " + ratio);
        InitializationSolution ref = new InitializationSolution();
        System.out.println("coefficient : " + ref.coefficient);
    }
}
