public class Test {

	public static void main(String[] args) {
		int l[] = {0,1,2,3,4,5,6,7,8,9,11,15,16,19};
		BinarySearch b = new BinarySearch(l);

		for(int s : l){
			System.out.printf("the elem - index is: %d - %d\n",s, b.findElement(s));	
		}


	}

}
