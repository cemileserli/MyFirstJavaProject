import java.util.ArrayList;
import java.util.LinkedList;

public class ArrayListExample {
    public ArrayListExample(){

    }

    public static void main(String[] args) {
        ArrayList<String> months = new ArrayList<>();
        months.add("January");
        months.add("January2");
        months.add("February");
        months.add("March");
        months.remove("January2");
        System.out.println(months);

        LinkedList<String> days = new LinkedList<>();
        days.add("Monday");
        days.add("Tuesday");
        days.add("Wednesday");
        days.add(0,"Sunday");
        System.out.println(days);
    }
}
