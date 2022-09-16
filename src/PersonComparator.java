import java.util.Comparator;

public class PersonComparator implements Comparator<Person> {
    private int maxWords;
    public PersonComparator(int maxWords){
        this.maxWords = maxWords;
    }

    @Override
    public int compare(Person o1, Person o2) {
        int o1WordCount = o1.getSurname().split(" ").length;
        int o2WordCount = o2.getSurname().split(" ").length;
        int stringComp = o2WordCount - o1WordCount;
        if(stringComp == 0 ||(o2WordCount >= maxWords && o1WordCount >= maxWords)){
            return o2.getAge() - o1.getAge();
        }
        return stringComp;
    }
}
