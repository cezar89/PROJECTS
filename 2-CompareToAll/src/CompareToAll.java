
public class CompareToAll {
	public static void main(String args[]){
		int a[] = new int[5];
		int n = 5;
		a[0]=20;
		a[1]=15;
		a[0]=30;
		a[1]=15;
		a[1]=45;
		CompareToAll maxObj = new CompareToAll();
		int maximum = maxObj.max(a,n);
		System.out.printf("Max is %d.", maximum);
	}
	public int max(int a[],int n){
		int max = 0;
		boolean bool;
		
		for (int i =0 ; i<n;i++){
			bool = true;
			for (int j = 0 ; j<n;j++){
				if (a[j]>a[i]){
					bool = false;
					break;
				}
			}
			if (bool == true){
				max = a[i];
				break;
			}
		}
		
		return max;
	}
}
