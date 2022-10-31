import java.util.HashSet;
import java.util.Set;

public class SetReview {
    public static void main(String[] args) {
        Set<String> colors = new HashSet<String>();
        colors.add("red");
        colors.add("orange");
        System.out.println(colors);

        if(colors.contains("red"))
            System.out.println("We have a red");
        Set<String> primary = new HashSet<String>();
        primary.add("blue");
        primary.add("red");

        for(String value : primary){
            System.out.println(value);
        }

        //colors.addAll(primary); //Union colors and primary
        //colors.retainAll(primary); //keep only the intersecting ones
        colors.removeAll(primary); //remove the intersecting ones
        System.out.println(colors);
        System.out.println(colors.size());



    }
}
