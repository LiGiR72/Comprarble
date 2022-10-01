import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Person> list = new ArrayList<>();
        list.add(new Person("Robert", "won Robertson", 47));
        list.add(new Person("William", "won bon Wlliamson", 16));
        list.add(new Person("Test","More Then Three Words",40));
        list.add(new Person("Bob", "Ros", 35));
        list.add(new Person("Robert", "won Robertsonv2", 17));
        list.removeIf( person -> person.getAge() < 18);
        Collections.sort(list,new PersonComparator(3));
        System.out.println(list);
    }
}