package chapter02;

public class MyException extends Exception {
	private static final long serialVersionUID = -182907437;
	
	public MyException(){
		super("MyException Occurs");
	}
	
	public MyException(String message){
		super(message);
	}

}
