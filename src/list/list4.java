package list;
import javax.swing.*;
import javax.xml.xpath.XPathEvaluationResult;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.ArrayList;
public class list4 {
    public static void main(String []args){
        List<Person> people = new ArrayList<>(){{
            add(new Person("Isaque", 23, "black"));
            add(new Person("Isaque", 20, "pard"));
            add(new Person("Eliseu", 22, "pard"));
        }};
        System.out.println("----\tOrdem de inserção\t----");
        System.out.println(people);
        System.out.println();
        System.out.println("----\tOrdem aleatoria\t----");
        Collections.shuffle(people);
        System.out.println(people);
        System.out.println();
        System.out.println("----\tOrdem natural\t----");
        Collections.sort(people);
        System.out.println(people);
        System.out.println();
        System.out.println("----\tOrdem idade\t----");
        people.sort(new ComparatorAge());
        System.out.println(people);
        System.out.println();
        System.out.println("----\tOrdem cor\t----");
        people.sort(new ComparatorColor());
        System.out.println(people);
        System.out.println();
        System.out.println("----\tOrdem /nome/cor/idade\t----");
        Collections.sort(people, new CompareNameColorAge());
        //people.sort(new CompareNameColorAge());
        System.out.println(people);

    }
    public static class Person implements Comparable{
        private String name;
        private int age;
        private String color;

        public Person(){}
        public Person(String name, int age, String color){
            this.name = name;
            this.age = age;
            this.color = color;
        }
        @Override
        public String toString(){
            StringBuilder sd = new StringBuilder();
            sd.append("Name: " + this.getName());
            sd.append(", Age: " + this.getAge());
            sd.append(", Color: " + this.getColor());

            return sd.toString();
        }
        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public String getColor() {
            return color;
        }

        public void setColor(String color) {
            this.color = color;
        }

        @Override
        public int compareTo(Object o) {
            return this.name.compareToIgnoreCase(this.getName());
        }
    }
    public static class ComparatorAge implements Comparator<Person>{

        @Override
        public int compare(Person person1, Person person2) {
            return Integer.compare(person1.getAge(), person2.getAge());
        }
    }
    public static class ComparatorColor implements Comparator<Person>{
        @Override
        public int compare(Person person1, Person person2){
            return person1.getColor().compareToIgnoreCase(person2.getColor());
        }
    }
    public static class CompareNameColorAge implements Comparator<Person>{
        @Override
        public int compare(Person person1, Person person2){
            int name = person1.getName().compareToIgnoreCase(person2.getName());
            if(name != 0) return name;

            int color = person1.getColor().compareToIgnoreCase(person2.color);
            if(color != 0) return name;
            return Integer.compare(person1.getAge(), person2.getAge());
        }
    }
}

