
public class BinarySearch {
	private int listInt[] = new int[100];
	public BinarySearch(int listInt[]){
		this.listInt = listInt;
	}
	public int[] getList(){
		return listInt;
	}
	
	public int findElement(int elem){
		int j = 0;
		int i = listInt.length/2;
		int s = 0;
		/*put here the */
		while(true){
			s=i/2;
			if (s==0){s=1;}
			if (listInt[i] == elem){
				j = i;
				break;
			}
			else if(elem < listInt[i] ){
				i = i - s;
				continue;
			}
			else{
				i = i + s;
				continue;
			}
		}
		
		return j;
	}
	
}
