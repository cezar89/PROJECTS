



public class CompareToMax{
	public static void main(String args[]){
		int a[] = new int[2];
		int n = 2;
		a[0] = 3;
		a[1]= 2;
		
		System.out.printf("max is: %d", max(a,n));
	}
	static int max(int a[],int n){
		int m = 0;
		for(int i = 0; i<n;i++){
			if(a[i]>m){
				m=a[i];
			}
		}
		return m;
	}
}

























/*public class CompareToMax{
	public static void main(String args[]){
		int a[] = new int[5];
		int n = 5;
		a[0]=2;
		a[1]=45;
		a[2]=10;
		a[3]=3;
		a[4]=30;
		System.out.printf("The max is: %d", maxim(a,n));
	}
	static int maxim(int[] a,int n){
		int max=0;
		for(int i = 0 ; i<n ; i=i+1){
			if (a[i]>max){
				max = a[i];
			}
		}
		return max;
	}
}

*/
























/*public class CompareToMax {

	public static void main(String[] args) {
		int a[] = new int[5];
		a[0]=10;
		a[1]=15;
		a[2]=11;
		a[3]=40;
		a[4]=14;
		
		int n = 5;
		
		int max = compareMax(a,n);
		System.out.printf("The max is: %d\n",max);
	}

	static int compareMax(int a[],int n){
		int max = 0;
		
		for(int i=0;i<4;i++){
			if(a[i]>max){
				max = a[i];
			}
			else{
				continue;
			}
		}

		
		return max;
	}
}
*/