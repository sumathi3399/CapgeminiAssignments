import java.util.ArrayList;

public class Q4 {
    public ArrayList<String> removeOddLength(ArrayList<String> employeeList){
        employeeList.removeIf(word -> word.length() % 2 != 0);
        return employeeList;
    }
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("crow");
        list.add("dog");
        list.add("animal");
        list.add("bully");
        Q4 a = new Q4();
        System.out.println(a.removeOddLength(list));
    }
}

