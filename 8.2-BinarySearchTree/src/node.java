
public class node {
	private int data;
	private node left;
	private node right;
	
	public node(){
	}
	
	public void copyOf(node n){
		this.data = n.data;
		this.left = n.left;
		this.right = n.right;
	}
	
	public void setLeft(node n){
		this.left = n;
	}
	public void setRight(node n){
		this.right = n;
	}
	public void setData(int d){
		this.data = d;
	}
	public int getData(){
		return this.data;
	}
	public node getLeft(){
		return this.left;
	}
	public node getRight(){
		return this.right;
	}
}