
public class Assignment2Q1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//SingletonInheritanceCheck sin= new SingletonInheritanceCheck();
		//sin.getInstance();
		System.out.println(Singleton.getInstance().toString());

	}
}
class Singleton{
	private static Singleton single_instance = null; 
    public String s; 
    private Singleton() 
    { 
        s = "Hello I am a string part of Singleton class"; 
    }
    public static Singleton getInstance() 
    { 
        if (single_instance == null) 
            single_instance = new Singleton(); 
  
        return single_instance; 
    } 
}
/*class SingletonInheritanceCheck extends Singleton {
	
		Singleton.getInstance();
	
}*/
