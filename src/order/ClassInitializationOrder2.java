package order;

public class ClassInitializationOrder2 {
    public static void main(String[] args) {
        //ClassAA A;
//        System.out.println(ClassAA.i);
        //ClassA.init();

        //ClassAA.printInfo();
        //new ClassAA(2);
    }
}

    class ClassAA{
        static int i = 21;
        static {
            System.out.println("in static intitializer block of ClassAA - 1");
        }


        public ClassAA(){
            System.out.println("\nIn ClassAA");

        }

        static String s = "ClassInitializationOrder2";

        static {
            System.out.println("in static intitializer block of ClassAA - 2");
        }

        static void printInfo(){
            System.out.println("\nInfo");
            System.out.println("i : " + i);
        }



    }

