
public class test {

	public static void main(String[] args) {
		
		//create a new list
		LinkedList l = new LinkedList();
		
		//add to the end of the list
		l.addToEnd(1);
		l.addToEnd(2);		
		l.addToEnd(3);
		
		//add to the front of the list
		l.addToFront(4);
		l.addToFront(5);
		
		//add again to the end
		l.addToEnd(8);
		
		//print the list
		l.printList();
		System.out.print("\n");
		
		//find an element
		System.out.print("elem: " +l.find(8));
		System.out.print("\n");
		
		//delete an element
		l.delete(5);
		l.printList();
		System.out.print("\n");
		
		l.delete(4);
		l.printList();
		System.out.print("\n");
		
		l.delete(8);
		l.delete(3);

		l.delete(1);
		l.printList();
		System.out.print("\n");
	}

}