
public class test {

	public static void main(String[] args) {
		tree t = new tree();
		
		t.add(5);
		t.add(3);		
		t.add(8);
		
		t.add(4);
		t.add(9);		
		t.add(1);
		
		//System.out.println("" + t.getTree(t.head));
		
		tree.stack s = t.new stack();
		s.push(t.head);
		s.push(t.head.right);
		s.push(t.head.left);
		
		System.out.println(s.pop().getData());
		System.out.println(s.pop().getData());
		System.out.println(s.pop().getData());
		System.out.println(s.pop().getData());
		System.out.println("line");
		System.out.println(t.getLevels());
	}
}
