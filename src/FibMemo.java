import java.util.HashMap;
import java.util.Map;

public class FibMemo {

    public static void main(String[] args) {
        Map<Long, Long> map = new HashMap<Long, Long>();
        //System.out.println(FibMemo(10, map));

        //map = new HashMap<Long, Long>();
        //System.out.println(FibMemo(20, map));
        System.out.println(FibMemo(100, map));
        System.out.println(map);
    }

    public static long FibMemo(long n, Map<Long, Long> map) {
        if(n < 2){
            map.put(n, n);
            return n;
        }
        else if(map.containsKey(n)){
            return map.get(n);
        }
        else{
            long val = FibMemo(n-1, map) + FibMemo(n-2, map);
            map.put(n, val);
            return map.get(n);
        }
    }

}