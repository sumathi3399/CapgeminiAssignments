import java.util.Scanner;

class ArmstrongOrNot {
    public int armstrongCheck(int num) {
        int n=num;
        int r;int sum=0;
        while(n!=0){
            r = n%10;
            n = n/10;
            sum = sum + r*r*r;
        }
        return sum;
    }
}
public class Q1 {
        public static void main(String[] args) {
            int n,r;
            Scanner s = new Scanner(System.in);
            System.out.println("Enter number : ");
            n = s.nextInt();
            ArmstrongOrNot arm = new ArmstrongOrNot();
            r = arm.armstrongCheck(n);
            if(r==n){
                System.out.println("Armstrong num");
            }
            else{
                System.out.println("Not Armstrong num");
            }
        }
}
