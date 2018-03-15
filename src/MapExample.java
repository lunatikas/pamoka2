import java.util.HashMap;
import java.util.Map;

public class MapExample {
    public static void main(String[] args) {
        Map<String,String> names= new HashMap<>();
        names.put("Pirmas", "Jonas");
        names.put("Antras", "Tomas");
        names.put("Trecias", "Antanas");
        names.put("Ketvirtas", "Kajus");

        for( String name : names.keySet()){
            System.out.println(name +" " + names.get(name));
        }


    }
}
