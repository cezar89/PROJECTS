
public class stringNode {
	public stringNode next;
	String data;
	
	public stringNode(String data){
		this.data = data;
	}
	
	public stringNode add(String data){
		stringNode temp = new stringNode(data);
		temp = this.next;
		return temp;
	}

	public String toString(){
		return data;
	}
}