
public class tree {
	
	node head;
	
	public tree(){
		head = new node();
	}
	
	
	public void add(int data){
		if (head.data == 0){
			head.data = data;
		}
		
		else{
			node current = null;
			current = head;
			while(current != null){
				if (data < current.data){
					if (current.left == null){
						current.left = new node();
						current.left.data = data;
						break;
					}
					current = current.left;
				}
				else{
					if (current.right == null){
						current.right = new node();
						current.right.data = data;
						break;
					}
					current = current.right;
				}
				
			}

		}
	}
	
	public String getTree(node h){
		node cursor = h;
		if (cursor == null){
			return "";
		}
		else{
			return ""  + getTree(cursor.left)+ cursor.data+getTree(cursor.right);
		}
	}

}
