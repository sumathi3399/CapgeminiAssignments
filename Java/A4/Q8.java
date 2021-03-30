import java.util.ArrayList;

public class Q8 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        Q8 a = new Q8();
        //a.run(list);
        Thread t = new Thread(() -> list.stream().forEach(System.out::println));
        t.start();
    }
}