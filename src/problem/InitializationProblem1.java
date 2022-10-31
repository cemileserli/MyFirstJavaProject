package problem;

import java.time.LocalTime;

public class InitializationProblem1 {
    String name;
    double coefficient;

    InitializationProblem1(){
        name = "default";

        LocalTime now = LocalTime.now();

        if(now.isBefore(LocalTime.NOON))
            coefficient = 2;
        else
            coefficient = 4;
    }

    InitializationProblem1(String name){
        this.name = name;

        LocalTime now = LocalTime.now();
        if(now.isBefore(LocalTime.NOON))
            coefficient = 2;
        else
            coefficient = 4;
    }


}
