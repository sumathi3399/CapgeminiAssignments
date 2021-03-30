abstract class Persistence {
	abstract public String persist();
}
class FilePersistence extends Persistence{
	@Override
	public String persist() {

	return "data is being saved in File.";
	}
}
class DatabasePersistence extends Persistence{
	@Override
	public String persist() {
		return "data is being saved in Database.";
	}
}

public class Assignment2Q6 {

	public static void main(String[] args) {
		Persistence fP= new FilePersistence();
		Persistence dP=new DatabasePersistence();
		System.out.println(fP.persist());
		System.out.println(dP.persist());

	}

}