package order;

public class ClassInitializationOrder1 {
    public static void main(String[] args) {
        //Class A;
        //System.out.println(ClassA.i);
        //ClassA.init();
        System.out.println(ClassA.CONSTANT);
        //ClassA.printInfo();
        //new ClassA(2);
    }
}

    class ClassA{
        static int i = 5;
        private static double d1;

        static {
            System.out.println("i : " + i);
            System.out.println("Initial value of d1 : " + d1);
            d1 = Math.random() * 10;
            System.out.println("And now the value of d1 : " + d1);
        }

        public ClassA(){
            System.out.println("\nStarting ClassA");
            System.out.println("The value of d1 : " + d1);
            d1 = Math.random() * 10;
            System.out.println("And now the value of d1 : " + d1);

            System.out.println("The value of d2 : " + d2);
            d2 = Math.random() * 100;
            System.out.println("And now the value of d2 : " + d2);
            System.out.println("Ending ClassA()");

        }
        public ClassA(int a) {
            System.out.println("\nStarting ClassA with param");
            d1 = a;
        }

        static void printInfo(){
            System.out.println("\nInfo");
            System.out.println("i : " + i + " d1 : " + d1 + " d2 : " + d2);
        }

        private static double d2;

        static {
            System.out.println("Initial value of d2 : " + d2);
            d2 = Math.random() * 100;
            System.out.println("And now the value of d2 : " + d2);
        }

        public static final String CONSTANT = "Hi There";
        static {
            //CONSTANT = "Hello";
            System.out.println("CONSTANT : " + CONSTANT) ;
        }

        public static String init(){
            System.out.println("in init()");
            return "55";
        }

    }

