package order;

public class InitializationOrder {
    static int i = 13;
    String name;
    static A a = new A();

    public InitializationOrder(){
        this("InitializationOrder1");
        System.out.println("InitializationOrder1");
    }

    public InitializationOrder(String name) {
        this(name, 5);
        System.out.println("in InitializationOrder(String name)");
    }

    public InitializationOrder(String name, int i) {
        this.name = name;
        System.out.println("in InitializationOrder(String name, i)");
    }

    public static void main(String[] args) {
        System.out.println(InitializationOrder.i);
        System.out.println("********************");
    }

    C c = new C();

    static int[] ints = new int[10];

    static {
        System.out.println("Initializing the int array");
        for (int i = 0; i < ints.length; i++)
            ints[i] = i * 10;
    }

    boolean[] booleans = new boolean[10];
    {
        System.out.println("Initializing the boolean array");
        boolean b = false;
        for (int i = 0; i < booleans.length; i++)
            booleans[i] = !b;
    }

    public static final D d = new D();
}


class A {
    public A(){
        System.out.println("in A()");
    }

    C c = new C();
}

class B {
    public B(){
        System.out.println("in B()");
    }

    public void f(){
        System.out.println("in f()");
    }
}

class C {

    static B b = new B();
    public C(){
        System.out.println("in C()");
    }

    public void g(){
        System.out.println("in g()");
    }
}

class D {

    static int i;

    static  {
        i = 65;
        System.out.println("i : " + i);
    }

    public void D(){
        System.out.println("in D()");
    }


}