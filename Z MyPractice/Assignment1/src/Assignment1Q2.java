import java.util.*;
public class Assignment1Q2 {

	public static void main(String[] args) {
		 int min = 100;int max = 999;
		 ArmstrongNumBetweenRange obj = new ArmstrongNumBetweenRange();
		 int arr1[]= obj.armstrongNumbersInRange(min,max);
		 for( int i = 0; i <(max-min); i ++ ){
			    if( arr1[i] != 0 ){
			        System.out.print( arr1[i] + " ");
			    }
			}
		 
		// TODO Auto-generated method stub

	}

}
class ArmstrongNumBetweenRange{
    public int[] armstrongNumbersInRange(int min , int max){
    	int arr[]=new int[max];
    	int size=0;
    	for(int i=min;i<=max;i++)
    	{
    		int n,a, b, c, sum = 0;
            n = i;
            a = n;
            c = n;
            
            while(n > 0)
            {
                b = n % 10;
                sum = sum+ (b*b*b);
                n = n / 10;
            }
            if(sum == c)
            {
            	arr[size]=i;
            	size++;
            	
            }
            
    	}
    	return (arr);
    	
    	
    }
}



