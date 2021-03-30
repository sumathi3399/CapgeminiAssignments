import java.util.ArrayList;
import java.util.List;

class Manager extends Q2 {
    public Manager(int empID, String fName) {
        super(empID, fName);
    }
    @Override
    public int getSalary(int salary) {
        int incentive = 5000;
        return salary + incentive;
    }
}
class Labour extends Q2 {
    public Labour(int empID, String fName) {
        super(empID, fName);
    }
    @Override
    public int getSalary(int salary) {
        int overtime = 500;
        return salary + overtime;
    }
}
public class Q2 {
    public int getSalary(int salary){
        return salary;
    }
    private int empID;
    private String fName;
    private static int salary = 10000;
    public Q2(int empID, String fName){
        this.empID = empID;
        this.fName = fName;
    }
    public static int totalEmployeesSalary(int employeeSalaries){
        return employeeSalaries;
    }
    public static void main(String[] args) {
        List<Integer> ar = new ArrayList<>();
        Q2 manager = new Manager(1, "Sagar");
        System.out.println(manager.getSalary(salary));
        Q2 labour = new Labour(2, "Rahul");
        System.out.println(labour.getSalary(salary));

        ar.add(totalEmployeesSalary(manager.getSalary(salary)+labour.getSalary(salary)));
        int total=0;
        for(int i : ar){
            total += i;
        }
        System.out.println("Details of Manager : "+"\n\tEmployee ID : "+manager.empID+"\n\tFirst Name : "+manager.fName+"\n\tSalary : $"+manager.getSalary(salary));
        System.out.println("Details of Labour : "+"\n\tLabour ID : "+labour.empID+"\n\tFirst Name : "+labour.fName+"\n\tSalary : $"+labour.getSalary(salary));
        System.out.println("--------------------------------------------------------------------------");
        System.out.println("Total Salary of Employees : $"+total);
    }
}

