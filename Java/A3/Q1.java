import java.util.TreeSet;
public class Person implements Comparable<Person>{
    private String name;
    private int height;
    private double weight;
    public Person(String name, int height, double weight) {
        this.name = name;
        this.height = height;
        this.weight = weight;
    }
   
    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", height=" + height +
                ", weight=" + weight +
                '}';
    }

    @Override
    public int compareTo(Person o) {
        if(this.weight>o.weight) return 1;
        else if(this.weight==o.weight){
            if (this.height>o.height) return 1;
        }
        else{
            return -1;
        }
        return 0;
    }
}

public class Assignment3Q1 {
    public static void main(String[] args) {
        TreeSet<Person> ts = new TreeSet<>();
        
        ts.add(new Person("Sagar",151,61));
        ts.add(new Person("Toy",152,63));
        ts.add(new Person("Rahul",153,63));
        ts.add(new Person("Cain",154,64));
        for (Person p : ts) {
            System.out.println(p);
        }
    }
}