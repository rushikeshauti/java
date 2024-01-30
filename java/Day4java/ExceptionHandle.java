package Day4java;

public class ExceptionHandle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
try{
	String str = null;
	str.equals("hello");
}
catch(Exception e)
{
	System.out.println("Exception is :"+e);
}
		
System.out.println("welcome");
		
	}

}
