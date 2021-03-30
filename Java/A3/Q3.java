import java.util.ArrayList;
import java.util.List;
import java.util.Collections;
import java.util.Scanner;

public class Q3 {
    public static List<Integer> traverseReverse(ArrayList<Integer> aList){
        Collections.reverse(aList);
        return aList;
    }
    public static void main(String[] args) {
        ArrayList<Integer> l = new ArrayList<>();
        System.out.println("Enter number of elements : ");
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        for(int i=0;i<num;i++){
            System.out.println("Enter ["+(i+1)+"]th element : ");
            l.add(scanner.nextInt());
        }
        System.out.println("Elements in reversed order : ");
        System.out.println(traverseReverse(l));
    }
}