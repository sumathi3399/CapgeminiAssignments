class Student {
	private int subjectA,subjectB,subjectC;
	
	public static int studentsTotalMarksInAllSubjects(Student[] students) {
		int sum=0;
		for(Student s:students)
		{
			sum+=s.subjectA+s.subjectB+s.subjectC;
		}
		return sum;
	}
	
	public static double studentsAverageMarksInAllSubjects(Student[] students) {
		double avg=0;
		int sum=0;
		for(Student s:students)
		{
			sum+=s.subjectA+s.subjectB+s.subjectC;
		}
		avg=sum/3;
		return avg;
	}
	
	public static int subjectATotalByStudents(Student [] students) {
		int sum=0;
		for(Student s:students)
		{
			sum+=s.subjectA;
		}
		return sum;
	}
	public static int subjectBTotalByStudents(Student [] students) {
		int sum=0;
		for(Student s:students)
		{
			sum+=s.subjectB;
		}
		return sum;
	}
	public static int subjectCTotalByStudents(Student [] students) {
		int sum=0;
		for(Student s:students)
		{
			sum+=s.subjectC;
		}
		return sum;
	}
	
	
	public static double subjectAAverageByStudents(Student [] students) {
		double avg=0;
		int sum=0;
		for(Student s:students)
		{
			sum +=s.subjectA;
		}
		avg=sum/3;
		return avg;
	}
	public static double subjectBAverageByStudents(Student [] students) {
		double avg=0;
		int sum=0;
		for(Student s:students)
		{
			sum +=s.subjectB;
		}
		avg=sum/3;
		return avg;
	}
	public static double subjectCAverageByStudents(Student [] students) {
		double avg=0;
		int sum=0;
		for(Student s:students)
		{
			sum +=s.subjectC;
		}
		avg=sum/3;
		return avg;
	}
	
	Student(int x,int y, int z)
	{
		subjectA=x;
		subjectB=y;
		subjectC=z;
	}
}

public class Assignment1Q9 extends Student{

	Assignment1Q9(int x, int y, int z) {
		super(x, y, z);
	}
	public static void main(String[] args) {
		Student student1= new Student(10,20,30);
		Student student2= new Student(10,20,30);
		Student student3= new Student(10,20,30);
		Student s[]={student1,student2,student3};
		System.out.println(studentsTotalMarksInAllSubjects(s));
		System.out.println(studentsAverageMarksInAllSubjects(s));
		System.out.println(subjectATotalByStudents(s));
		System.out.println(subjectAAverageByStudents(s));
		System.out.println(subjectBTotalByStudents(s));
		System.out.println(subjectBAverageByStudents(s));
		System.out.println(subjectCTotalByStudents(s));
		System.out.println(subjectCAverageByStudents(s));
	}
}