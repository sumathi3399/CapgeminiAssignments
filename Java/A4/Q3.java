import java.time.LocalDateTime;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Q3{
    static void modifyValue(){
        
        Consumer<String> c = (String t) -> System.out.println(t);
        c.accept("in the modifyValue block....");

        
        Function<String, String> function = (string) -> string.toUpperCase();
        System.out.println(function.apply("also using function....for UPPER"));

    }
    static void display() {
        Supplier<LocalDateTime> supplier = () -> LocalDateTime.now();
        System.out.println(supplier.get());
    }
    static class Product implements Predicate<Integer> {
        @Override
        public boolean test(Integer integer) {
            
            if (integer % 2 == 0){
                return true;
            }
            else return false;
        }
    }
    public static void main(String[] args) {
        // for Consumer and Function
        modifyValue();
        System.out.println("---------------------------");

        // for Supplier
        display();
        System.out.println("---------------------------");

        // for Predicate
        Product p = new Product();
        System.out.println(p.test(10));

    }
}
