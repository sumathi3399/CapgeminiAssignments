import java.util.HashMap;
public class Q7 {
    public static void main(String[] args) {
        Q7 a = new Q7();
        HashMap<String, Integer> map = new HashMap<>();
        map.put("apple", 1);
        map.put("dog", 2);
        map.put("cat", 3);

        System.out.println(a.convertKeyValueToString(map));
    }
    public String convertKeyValueToString(HashMap<String, Integer> map) {
        StringBuilder builder = new StringBuilder();
        map.forEach((key, value) -> builder.append(key + value));
        return builder.toString();
    }
}

