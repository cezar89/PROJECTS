
public class test {

	public static void main(String[] args) {
		tree t = new tree();
		
		t.add(5);
		t.add(3);		
		t.add(8);
		
		t.add(4);
		t.add(9);		
		t.add(1);
		
		System.out.println("" + t.getTree(t.head));
		
		//System.out.println("" + t.getTreeOrdered(t.head));
	}

}
