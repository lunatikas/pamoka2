import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class ListExample {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("Andrius");
        names.add("Tomas");
        names.add("Laurynas");
        Collections.sort(names);

        for(String name: names){
            System.out.println(name);
        }

        System.out.println(names.get(1));
        System.out.println(names.size());

        System.out.println(names.isEmpty());
        System.out.println(names.contains("Tomas"));

    }
}
