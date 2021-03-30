
public class Assignment1Q5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TaxAmount obj =new TaxAmount();
		System.out.println(obj.calculateTaxAmount(400000));

	}

}
class TaxAmount{
    public double calculateTaxAmount(int ctc){
    	double d=0;
    	if(ctc>0 && ctc<180000)
    			{
    			return 0;
    			}
    	else if(ctc>181001 && ctc<300000)
    	{
    		d=ctc/10;
   
    	}
    	else if(ctc>300001 && ctc<=500000)
    	{
    		d=ctc*0.2;
    		
    	}
    	else if(ctc>500001 && ctc<=1000000)
    	{
    	d=ctc*0.3;
    		
    	}
    	return d;
    }
}
