import java.util.Scanner;

public class Assignment1Q6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Login login = new Login();
		String l,p;
		Scanner sc = new Scanner(System.in);
    	System.out.println("Enter userId");
		l=sc.nextLine();
		System.out.println("Enter password");
		p=sc.nextLine();
		System.out.print(login.loginUser(l, p));
	
		
		
	}

}
class Login{
    String userId = "Ajay",password = "password";
    public String loginUser(String user, String pass) {
    	int count=0;
    	String res="";
    	
    		if(userId.equals(user) && password.equals(pass))
    		{
    			res= "Welcome" +user;
    			return res;
    		}
    		else if(count<3)
    		{
    			count++;
    			res= "You have entered wrong credentials ,please enter the right credentials.";
    			return res;
    		}
    		


    		
    			return "Contact Admin";
		
		
    }

}