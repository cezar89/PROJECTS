//List.java
package question_1;
public class List {
	
	public Node head;
	public Node last;
	
	public List(){
		head = new Node();
		head.value = 0;
	}
	public List(int data){
		head = new Node();
		head.value = data;
	}
	public List(Node head){
		//INITIALIZE THE NODE HEAD 
		this.head = head;
		//INITIALIZE THE NODE LAST 
		Node cursor = head;
    	while (cursor.next != null){
    		cursor = cursor.next;
    	}
    	this.last = cursor;
	}
	
	public void insert(int data){
		//IF THE EMPTY CONSTRUCTOR IS USED
		if (head == null){
			head = new Node();
			head.value = data;
		}
		else{
			//IF THE HEAD DOESN'T HAVE A NEXT LINK, I CREATE A LINK AND ASSIGN
			//IT TO THE LAST NODE
			if (last == null){
				head.next= new Node();
				head.next.value = data;
				last = head.next;
			}
			//I KEEP TRACK OF THE LAST LINK IN THE LIST SO THAT
			//I CAN ADD ELEMENTS WITHOUT PARSING THROUGH THE LIST
			else{
				last.next = new Node();
				last.next.value = data;
				last = last.next;
			}
		}
	}
	//SPACE COMPLEXITY IS O(1) - THE LINKES ARE CHANGED IN PLACE, NO ADDITIONAL SPACE IS ADDED 
	//TIME COMPLEXITY IS O(n) - HAS TO GO FROM THE BEGINING UNTIL THE END OF THE LIST
    public Node reverse(Node head) {
    	Node currentNode = head;
    	Node previousNode = null;
    	Node nextNode = null;
    	while (currentNode != null){
    		//GO THROUGH ALL THE NODES AND REVERSE THE LINKS
    		nextNode = currentNode.next;
    		currentNode.next = previousNode;
    		previousNode = currentNode;
    		currentNode = nextNode;
    	}
    	head = previousNode;
    	return head;
    }
    
    public String getList(){
    	Node cursor = this.head;
    	String str="";
    	while (cursor != null){
    		if (str==""){
    			str = str + cursor.value;
    		}
    		else{
	    		str = str +","+ cursor.value;
    		}
    		cursor = cursor.next;
    	}
    	return str;
    }
	
	
}
