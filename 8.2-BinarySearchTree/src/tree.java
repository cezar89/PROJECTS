
public class tree {
	private node head;
	
	public tree(){
		
	}
	
	public void addInteger(int n){
		if (head == null){
			head = new node();
			head.setData(n);
		}
		else{
			node temp = head;
			while (true){
				if (head.getData() < n){ 
					if(head.getRight()==null){
						head.setRight(new node());
						head.getRight().setData(n);
						break;
					}
					head = head.getRight();
				}
				else{
					if(head.getLeft() == null){
						head.setLeft(new node());
						head.getLeft().setData(n);
						break;
					}
					head = head.getLeft();
				}
			}
			head = temp;	
		}
	}
	
	public int getAncestor(int a, int b){
		node temp = head;
		while(true){
			if(a<temp.getData() && b<temp.getData()){
				temp = temp.getLeft();
			}
			else if(a>temp.getData() && b>temp.getData()){
				temp = temp.getRight();
			}
			else {
				return temp.getData();
			}
		}
		
	}
	
}





