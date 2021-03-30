import java.util.HashSet;
import java.util.LinkedHashSet;

public class Q2 {
    public static void main(String[] args) {
        LinkedHashSet<String> lHS = new LinkedHashSet<>();
        HashSet<String> hS = new HashSet<>();


        System.out.println("Linked Hash Set : ");
        System.out.println(ordered(lHS));;
        System.out.println("-------------------------------------------");
        System.out.println("Hash Set : ");
        System.out.println(unordered(hS));;

    }
    public static LinkedHashSet ordered(LinkedHashSet linkedHashSet){
 
        linkedHashSet.add("India");
        linkedHashSet.add("UK");
        linkedHashSet.add("Colombia");
        linkedHashSet.add("Denmark");
        linkedHashSet.add("Ecuador");
        return linkedHashSet;
    }
    public static HashSet unordered(HashSet hashSet){
        hashSet.add("India");
        hashSet.add("UK");
        hashSet.add("Colombia");
        hashSet.add("Denmark");
        hashSet.add("Ecuador");
        return hashSet;
    }
}