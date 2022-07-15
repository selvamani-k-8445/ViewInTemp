import java.util.ArrayList;
import java.util.List;

public class typeSafetyBypass {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        addNames(names,"One");
        addNames(names,"One");
        addNames(names,"One");
        System.out.println(names);
        // bypassing type checks
        addNames(names,1);
        addNames(names,2);
        addNames(names,3);
        System.out.println(names);

    }
    static void addNames(List<String> names,String name){
        names.add(name);
    }

    static void addNames(List names,Integer a){ // type parameter is not passed
        names.add(a);
    }
}
