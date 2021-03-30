import java.util.HashMap;
import java.util.Map;

class Employee {
    private String name;
    private int id;

    public Employee(String name, int id) {
        this.name = name;
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        
        return true;
    }

    @Override
    public int hashCode() {
        
        return 1;
    }
}

public class Q5 {
    public static void main(String[] args) {
        HashMap<Employee, Integer> hm = new HashMap<>();
        Employee e = new Employee("roy",1);
        Employee e1 = new Employee("tor",2);
        
        hm.put(e,300);
        
        hm.put(e1,200);
        
        System.out.println(hm.get(e));
        System.out.println(hm.get(e1));
        for(Map.Entry<Employee, Integer> entry: hm.entrySet()) {
            // here we can check that the key is same,but value gets overridden
            // print the corresponding key by entering the specific value
            if(entry.getValue() == 300) {
                System.out.println("The key for value is " + entry.getKey());
                break;
            }
        }

    }
}

