import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        int maxWords = 3;
        List<Person> list = new ArrayList<>();
        list.add(new Person("Robert", "won Robertson", 47));
        list.add(new Person("William", "won bon Wlliamson", 56));
        list.add(new Person("Test","More Then Three Words",40));
        list.add(new Person("Bob", "Ros", 35));
        list.add(new Person("Robert", "won Robertsonv2", 48));
        Collections.sort(list,(Person o1, Person o2) -> {
            int o1WordCount = o1.getSurname().split(" ").length;
            int o2WordCount = o2.getSurname().split(" ").length;
            int stringComp = o2WordCount - o1WordCount;
            if(stringComp == 0 ||(o2WordCount >= maxWords && o1WordCount >= maxWords)){
                return o2.getAge() - o1.getAge();
            }
            return stringComp;
        });
        System.out.println(list);
    }
}