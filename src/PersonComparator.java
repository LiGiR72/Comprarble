import java.util.Comparator;

public class PersonComparator implements Comparator<Person> {
    @Override
    public int compare(Person o1, Person o2) {
        int stringComp = o2.getSurname().split(" ").length - o1.getSurname().split(" ").length;
        if(stringComp == 0){
            return o2.getAge() - o1.getAge();
        }
        return stringComp;
    }
}
