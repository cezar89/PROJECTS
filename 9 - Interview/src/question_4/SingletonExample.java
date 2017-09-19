package question_4;
public class SingletonExample {

	private static SingletonExample myObj;

    private SingletonExample(){    
    }
 
    public static SingletonExample getInstance(){
        if(myObj == null){
            myObj = new SingletonExample();
        }
        return myObj;
    }
     
    public void printMyName(){
        System.out.println("My name is Cezar.");
    }
     
    public static void main(String a[]){
    	SingletonExample st = SingletonExample.getInstance();
        st.printMyName();
    }
}
	

