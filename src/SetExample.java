import java.util.HashSet;
import java.util.Set;

public class SetExample {
    public static void main(String[] args) {
        Set<Integer> hashSet= new HashSet<>();
        hashSet.add(1233);
        hashSet.add(123);
        hashSet.add(1323);
        hashSet.add(123);
        System.out.println("hash dydis" + hashSet.size());

        for (Integer a : hashSet){
            System.out.println(a);
        }
    }
}
