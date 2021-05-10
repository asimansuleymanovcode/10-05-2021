package az.code;

import java.util.Comparator;

public class PersonComparators{
    public static class PersonComparatorByName implements Comparator<Person> {
        @Override
        public int compare(Person o1, Person o2) {
            return o1.getName().compareTo(o2.getName());
        }
    }
    public static class PersonComparatorByAge implements Comparator<Person> {
        @Override
        public int compare(Person o1, Person o2) {
            return o1.getAge() - o2.getAge();
        }
    }
}


class Test{
    public static void main(String[] args) {
//        Comparator c1 = new PersonComparatorByName();
        Comparator c1 = new PersonComparators.PersonComparatorByAge();

        System.out.println(c1.compare(new Person("Alim", "Qasimov", 60), new Person("Zamiq", "Memmedov", 21)));
    }

}
