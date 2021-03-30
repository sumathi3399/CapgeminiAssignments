import java.util.HashSet;
import java.util.LinkedHashSet;

public class Assignment3Q2 {
    public static void main(String[] args) 
    { 
    	System.out.println("Insertion elements: 2 4 3 5 4");
    	
    	LinkedHashSet<Integer> numset = new LinkedHashSet<Integer>();
    	LinkedHashSet<Integer> numset1 = new LinkedHashSet<Integer>();
    	
    	numset1=ordered(numset);
    	System.out.print("Elements in LinkedHashSet: ");
    	System.out.println(numset1);
    	
    	
    	HashSet<Integer> numset2 = new HashSet<Integer>();
    	HashSet<Integer> set2 = new HashSet<Integer>();
    	
    	set2=unordered(numset2);
    	System.out.print("Elements in HashSet: ");
    	System.out.print(set2);
    }
    
    public static LinkedHashSet<Integer> ordered(LinkedHashSet<Integer> linkedHashSet)
    {
    	linkedHashSet.add(2);
    	linkedHashSet.add(4);
    	linkedHashSet.add(3);
    	linkedHashSet.add(5);
    	linkedHashSet.add(4);
    	
    	return linkedHashSet; 
	}
    
    public static HashSet<Integer> unordered(HashSet<Integer> hashSet)
    {
    	hashSet.add(2);
    	hashSet.add(4);
    	hashSet.add(3);
    	hashSet.add(5);
    	hashSet.add(4);
    	return hashSet;
	}
}