
public class Assignment1Q7 {

	public static void main(String[] args) {
		int arr[] = { 5,12,14,6,78,19,1,23,26,35,37,7,52,86,47};
        int valueToCheck = 19;
        SearchArray obj = new SearchArray();
        System.out.print(obj.searchArray(arr, valueToCheck)); 
        		// TODO Auto-generated method stub
	}
}
class SearchArray{
    public boolean searchArray(int[] arr,int toCheckValue){
    	int l = 0, r = arr.length - 1; 
        while (l <= r) { 
            int m = l + (r - l) / 2; 
            if (arr[m] == toCheckValue) 
                return true;
            if (arr[m] < toCheckValue) 
                l = m + 1;
            else
                r = m - 1; 
        }
        return false; 
    }
}