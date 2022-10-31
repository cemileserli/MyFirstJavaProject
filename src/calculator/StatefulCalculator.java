package calculator;

import java.util.Scanner;

public class StatefulCalculator {
    String name;

    int firstArgument;

    public void setResult(double result) {
        this.result = result;
    }

    public void setOperation(char operation) {
        this.operation = operation;
    }

    int secondArgument;
    double result;
    char operation;

    Calculator calculator = new Calculator();

    public String getName(){
        return name;
    }

    public void setName(String newName){
        this.name = newName;
    }

    void whoAreYou(){
        System.out.println("I'm a Calculator, my name is " + name);
    }

    public int getFirstArgument() {
        return firstArgument;
    }

    public void setFirstArgument(int firstArgument) {
        this.firstArgument = firstArgument;
    }

    public int getSecondArgument() {
        return secondArgument;
    }
    public void setSecondArgument(int secondArgument) {
        this.secondArgument = secondArgument;
    }

    public double getResult(){
        switch (operation){
            case '+' : result = calculator.add(firstArgument, secondArgument);
            break;
            case '-' : result = calculator.substract(firstArgument, secondArgument);
            break;
            case '/' : result = calculator.divide(firstArgument, secondArgument);
            break;
            case '*' : result = calculator.multiply(firstArgument, secondArgument);
            break;
        }
        return result;
    }



    public static void main(String[] args) {
        StatefulCalculator calculator = new StatefulCalculator();
        Scanner sc = new Scanner(System.in);
        System.out.println("Input First Argument : ");
        int firstArgument = sc.nextInt();
        System.out.println("Input Second Argument : ");
        int secondArgument = sc.nextInt();
        System.out.println("Input the Operation type : ");
        char operation = sc.next().charAt(0);


        calculator.setFirstArgument(firstArgument);
        calculator.setSecondArgument(secondArgument);
        calculator.setOperation(operation);
        calculator.result = calculator.getResult();
        System.out.println("Result of the calculation : " + calculator.result);
    }
}
