
public class Assignment1Q3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SiCi obj = new SiCi();
		
		System.out.println(obj.compoundInterest(10000, 3, 2));
		System.out.println(obj.simpleInterest(1000,2,5));
		}
}
class SiCi {
	double sim,com;
    public double simpleInterest(double principalAmount,int time,double interestRate){
    	sim=(principalAmount * time * interestRate)/100;
    	return sim;
        }
    public double compoundInterest(double principalAmount,int time,double interestRate){
    	com=principalAmount * Math.pow(1.0+interestRate/100.0,time) - principalAmount;
    	return com;
    }
}
