
public class Assignment1Q4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ResultDeclaration obj = new ResultDeclaration();
		System.out.println(obj.declareResults(10, 30, 40));

	}

}
class ResultDeclaration{
    public String declareResults(double subject1Marks, double subject2Marks, double subject3Marks) {
    	String res="";
    	if(subject1Marks>60 && subject2Marks>60 && subject3Marks>60)
    	{
    		res="Passed";
    	}
    	else if((subject1Marks>60 && subject2Marks>60) || (subject2Marks>60 && subject3Marks>60) || (subject1Marks>60 && subject3Marks>60))
    	{
    		res="Promoted";
    	}
    	else if((subject1Marks>60 || subject2Marks>60 || subject3Marks>60) || (subject1Marks<60 && subject2Marks<60 && subject3Marks<60))
    	{
    		res="Failed";
    	}
		return res;
    }
}