package calculator;

public class Calculator {
    String name;

    public String getName(){
        return name;
    }

    public void setName(String newName){
        name = newName;
    }

    void whoAreYou(){
        System.out.println("I'm a Calculator, my name is " + getName());

    }

    public int add(int x, int y){
        return x + y;
    }

    public int substract(int x, int y){
        return x - y;
    }

    public double divide(int x, int y){
        try{
            return (double) x / y;
        }
        catch (ArithmeticException e){
            return 0.00;
        }

    }

    public int multiply(int x, int y){
        return x * y;
    }

    public static void main(String[] args) {
        Calculator calculator1 = new Calculator();
        calculator1.setName("Texas Instruments T-222");
        calculator1.whoAreYou();

        int i = calculator1.add(12, 27);
        System.out.println("12 + 27 : " + i);

        int k = calculator1.substract(12, 27);
        System.out.println("12 - 27 : " + k);

        double d = calculator1.divide(82, 5);
        System.out.println("82 / 5 : " + d);

        int m = calculator1.multiply(22, 5);
        System.out.println("22 * 5 : " + m);
        
        System.out.println(calculator1.power(2,5));
        System.out.println(calculator1.mod(36,5));
        System.out.println(calculator1.factorial(5));

    }

    private int factorial(int a) {
        int factorial = 1;
        for(int i = 1; i <= a; i++){
            factorial *= i;
        }

        return factorial;
    }

    private int mod(int a, int b) {
        return a % b;
    }

    private int power(int a, int b) {
        int power=1;

        for(int i = 0; i<b; i++){
            power *= a;
        }
        return power;
    }
}
