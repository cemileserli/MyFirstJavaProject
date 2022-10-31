import java.util.HashMap;

public class HashMapExample {
    public HashMapExample(){

    }

    public static void main(String[] args) {
        HashMap<String, String> flowerNames = new HashMap<>();
        flowerNames.put("Lily", "Lilium");
        flowerNames.put("Sunflower","Helianthus");
        flowerNames.put("Daffodil", "Narcissus");
        flowerNames.put("Orchid", "TBD");

        System.out.println(flowerNames);
        flowerNames.remove("Daf2fodil");


        flowerNames.replace("Orchid", "Orchidaceae");
        System.out.println(flowerNames);
        for (String key : flowerNames.keySet()){
            System.out.println("The scientific name : " + key + " is " + flowerNames.get(key) );
        }
        System.out.println(flowerNames.values());
        System.out.println(flowerNames.keySet());
        /*
        Put
        Remove
        Replace
        Key
        Value
         */

    }
}
