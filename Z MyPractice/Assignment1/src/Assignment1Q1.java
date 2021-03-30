//import java.util.Scanner;

public class Assignment1Q1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArmstrongOrNot obj = new ArmstrongOrNot();
		boolean b;
		b=obj.armstrongCheck(153);
		if(b==true)
		{
				System.out.println("Armstrong number");
		
	}
		else
		{
			System.out.println("not Armstrong");
		}
	}

}
class ArmstrongOrNot {
    public boolean armstrongCheck(int num) {
    	int n,a, b, c, sum = 0;
        //Scanner s = new Scanner(System.in);
        //System.out.print("Enter any integer you want to check:");
        n = num;
        a = n;
        c = n;
        
        while(n > 0)
        {
            b = n % 10;
            sum = sum+ (b*b*b);
            n = n / 10;
        }
        if(sum == c)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}