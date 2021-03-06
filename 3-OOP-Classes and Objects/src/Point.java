
public class Point {
	private int x;
	private int y;
	
	public Point(){
		this.x = 0;
		this.y = 0;
	}
	public Point(int x, int y){
		this.x=x;
		this.y=y;
	}
	public Point(Point p){
		this.x = p.getx();
		this.y = p.gety();
	}
	public int getx(){
		return this.x;
	}
	public int gety(){
		return this.y;
	}
	public void setx(int x){
		this.x = x;
	}
	public void sety(int y){
		this.y = y;
	}
	public String toString(){
		String s = String.format("(%d,%d)",this.x,this.y);
		return s;
	}
}
