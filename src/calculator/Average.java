package calculator;

public class Average {
    public static void main(String[] args) {
        Average average = new Average();
        System.out.println(average.average(2,3,8));
    }

    double average (int ... numbers){
        double averageVal = 0;
        for (int i=0; i <numbers.length; i++){
            averageVal += numbers[i];
        }
        averageVal = averageVal / numbers.length;

        return averageVal;
    }
}
