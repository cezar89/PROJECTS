
public class BinarySearch {
	private int listInt[] = new int[100];
	public BinarySearch(int listInt[]){
		this.listInt = listInt;
	}
	public int[] getList(){
		return listInt;
	}
	
	public int findElement(int elem){
		int left = 0;
		int right = listInt.length;
		int middle = 0;
		
		while (left <= right){
			middle =left + (right - left) / 2;
			if (listInt[middle] == elem){
				return middle;
			}
			else if (listInt[middle] < elem){
				left = middle + 1;
			}
			
			else{
				right = middle;
			}
		}
		return -1;
		
	}
	
}
