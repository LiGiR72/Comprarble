import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Person> list = new ArrayList<>();
        list.add(new Person("Robert", "won Robertson", 47));
        list.add(new Person("William", "won bom Wlliamson", 56));
        list.add(new Person("Bob", "Ros", 35));
        list.add(new Person("Robert", "won Robertsonv2", 48));
        list.sort(new PersonComparator());
        System.out.println(list);
    }
}