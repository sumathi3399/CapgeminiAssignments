import java.util.Arrays;
import java.util.List;

public class Q5 {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("alpha", "bravo", "charlie", "delta", "echo", "foxtrot");
        Q5 a = new Q5();
        System.out.println(a.processWords(list));
    }

    public String processWords(List<String> list) {
        String result = list.stream().map(s -> Character.toString(s.charAt(0))).reduce("", (a, b) -> a + b);
        return result;
    }
}
