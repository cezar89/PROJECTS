
public class node {
	public node left;
	public node right;
	public node next;
	public int data;
	
	public node(){
	}
	public node(node copy){
		this.left = copy.left;
		this.right = copy.right;
		this.data = copy.data;
		this.next = copy.next;
	}
	
	public String getData(){
		return data + "";
	}
}
