import java.util.ArrayList;

class CurrentAccount extends Assignment2Q3 {
    int totalDeposits = 10000;
    int creditLimit = 2000;
    @Override
    public int getCash() {
    	return totalDeposits-creditLimit;
    }
}
class SavingsAccount extends Assignment2Q3 {
    int totalDeposits = 10000;
    int fixedDepositAmount = 5000;
    @Override
    public int getCash() {
		return totalDeposits-fixedDepositAmount;
		}
}
public class Assignment2Q3 {
	int cash=1000;
    public int totalCashInBank(ArrayList<Integer> cash){
    	int totalCash=0;
    	for(int c: cash) {
    	totalCash+=c;
    	}
    	return totalCash;
    }
    public int getCash(){
    	return cash;
    }
    public static void main(String[] args) {
    	CurrentAccount cur= new CurrentAccount();
    	SavingsAccount sav=new SavingsAccount();
    	Assignment2Q3 obj=new Assignment2Q3();
    	System.out.println(sav.getCash());
    	System.out.println(cur.getCash());

    	ArrayList<Integer> cash= new ArrayList<Integer>();
    	cash.add(cur.getCash());
    	cash.add(sav.getCash());
    	System.out.println(obj.totalCashInBank(cash));
    }
}

