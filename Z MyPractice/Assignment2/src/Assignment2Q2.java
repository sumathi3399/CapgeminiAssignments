import java.util.ArrayList;

class Manager extends Assignment2Q2 {
    @Override
    public int getSalary(int salary) {
        int incentive = 5000;
        return salary+incentive;
    }
}

class Labour extends Assignment2Q2 {
    @Override
    public int getSalary(int salary) {
        int overtime = 500;
        return salary+overtime;
    }
}

public class Assignment2Q2 {
	int salary = 10000;
    public int getSalary(int salary){
    	return salary;
    	
    }
    public int totalEmployeesSalary(ArrayList<Integer> employeeSalaries){
    	int total=0;
    	for(int i : employeeSalaries ) {
    	total+=i;
    	}
    	return total;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Assignment2Q2 obj=new Assignment2Q2 ();
		Assignment2Q2 l=new Labour();
		Assignment2Q2 m=new Manager();
		ArrayList<Integer> Salaries = new ArrayList<Integer>();
		Salaries.add(l.getSalary(obj.salary));
		Salaries.add(m.getSalary(obj.salary));
		//System.out.println(employeeSalaries);
		System.out.println(obj.totalEmployeesSalary(Salaries));
	}

}
