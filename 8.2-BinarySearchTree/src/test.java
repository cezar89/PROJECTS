
public class test {
	public static void main(String args[]){
		tree t = new tree();
		
		t.addInteger(20);
		t.addInteger(8);
		t.addInteger(22);
		t.addInteger(4);
		t.addInteger(12);
		t.addInteger(10);
		t.addInteger(14);
		
		System.out.println("" + t.getAncestor(10, 8));
		
	}
}
