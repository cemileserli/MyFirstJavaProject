package staticExamples;

public class SystemDemo {
    public static void main(String[] args) {
        System.out.println("System.out.println");
        System.err.println("System.err.println");

        System.out.println("User home dir : " + System.getProperty("user.home"));
        System.out.println("User Working dir : " + System.getProperty("user.dir"));
        System.out.println("User Java Ver : " + System.getProperty("java.version"));
        System.out.println("Line Separator : " + System.lineSeparator());
        System.out.println("Path Separator : " + System.getProperty("path.separator"));

        long start = System.currentTimeMillis();
        long sum = 0;

        for(long i = 0; i < 1_000_000_000; i++){
            sum += i;
        }

        long end = System.currentTimeMillis();

        System.out.println("Time : " + (end - start) + " ms.");

        System.exit(1);

    }
}
