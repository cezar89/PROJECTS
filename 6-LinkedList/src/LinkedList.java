
public class LinkedList {
	private node first;
	
	public LinkedList(){
		first = null;
	}
	
	public boolean isEmpty(){
		return first == null;
	}
	
	public void insert(int data){
		node next = new node(data);
		next.next = first;
		first = next;
	}
	
	public node delete(){
		node temp = first;
		if(first == null){
			return null;
		}
		first = first.next;
		return temp;
	}

	public void printList(){
		node currentNode = first;
		System.out.print("List: ");
		while(currentNode != null){
			currentNode.printNode();
			currentNode = currentNode.next;
		}
		System.out.println("\n");
	}
	
}
