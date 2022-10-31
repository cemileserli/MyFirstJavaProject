package staticExamples;

public class StaticDemo {
    static int i = 10;
    public static void main(String[] args) {
        System.out.println("i :  " + i);
        System.out.println("Static i :  " + StaticDemo.i);
        StaticDemo.increment();
        System.out.println("Static i :  " + StaticDemo.i);
        StaticDemo sd1 = new StaticDemo();
        StaticDemo sd2 = new StaticDemo();

        System.out.println("Accessing via Instance, i :  " + sd1.i);
        System.out.println("Accessing via Instance, i :  " + sd2.i);

        StaticDemo.increment();
        sd1.increment();
        System.out.println("Accessing via Instance, i :  " + sd2.i);
        setI(22);
        aMethod();


    }

    static void setI(int i) {
        StaticDemo.i = i;
    }

    static void aMethod() {
        int i = 7;
        System.out.println("Local i :  " + i);
        System.out.println("Static i :  " + StaticDemo.i);
    }

    static void increment() {
        i++;
    }

}
