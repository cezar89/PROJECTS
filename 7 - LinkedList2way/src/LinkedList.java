
public class LinkedList {
	int index= 0;
	node head;
	public LinkedList(){
	}
	public void addToEnd(int data){
		if (head == null){
			head = new node(data);
			index++;
		}
		else{
			node temp = head;
			//I put a while loop so that the node will be added to the end of the list.
			while (temp != null){
				if (temp.next == null){
					temp.next = new node(data);
					temp.next.previous = temp;
					index++;
					break;
				}
				// here it iterates to the end of the 
				temp=temp.next;
			}
		}
	}
	
	public void addToFront(int data){
		node temp = new node(data);
		head.previous = temp;
		temp.next = head;
		head = temp;
	}
	

	public int find(int data){
		node temp = head;
		while(temp != null){
			if (temp.data == data){
				return temp.data;
			}
			temp = temp.next;
		}
		return 0;
	}
	
	public void delete(int data){
		node temp = head;
		if(head.data == data){
			head=head.next;
		}
		else{
	
			while (temp != null){
				//temp.printNode();
				if (temp.next.data == data){
					temp.next=temp.next.next;
					break;
				}
				temp = temp.next;
			}
			System.out.print("\n--");
			temp.printNode();
			System.out.print("--\n");
		}
	}
	
	
	public void printList(){
		node temp = head;
		while (temp != null){
			temp.printNode();
			temp =temp.next;
		}
	}
}
