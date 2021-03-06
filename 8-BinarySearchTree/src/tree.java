
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
	
	public String getLevels(){
		stack s = new stack();
		String str = "";
		s.push(head);
		while (true){
			node n = s.pop();
			
			if (n.data == 0){
				break;
			}
			else{
				str = str + " " + n.getData();
				if (n.right != null){
					s.push(n.right);
				}
				if (n.left != null){
					s.push(n.left);
				}
			}
		}
		
		return str;
	}
	
	public class stack{
		public node first;
		public void push(node n){
			if (first == null){
				first = new node(n);
			}
			else{
				node temp = new node(first);
				first = new node(n);
				first.next = temp;
			}
		}
		public node pop(){
			node temp;
			if (first == null) return new node();
			if (first.next == null){
				temp = null;
			}
			else {
				temp = new node(first.next);
			}
			node poped = new node(first);
			first = temp;
			return poped;
		}
		
	}

}
