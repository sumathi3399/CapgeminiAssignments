
public class Assignment2Q4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DemoAbstract obj = new DemoAbstract();
	       obj.disp2();
	}

}
abstract class MyAbstractClass{
	   public void disp(){
	     System.out.println("parent class");
	   }
	   abstract public void disp2();
	}
abstract class childclass extends MyAbstractClass{
	
}

class DemoAbstract extends MyAbstractClass{
	   //must override
	   public void disp2()
	   {
	       System.out.println("child class");
	   }
	   
	}
abstract class myabstractclass{
	
}
//Abstract class cannot be private.
//private abstract class myabstract{}
//Abstract class cannot be final
//final abstract class myabstract2{}