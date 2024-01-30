package jan_pac1;

public class TC002_variable {

	private double  wdth;
	private  double height;
	private double depth;

//	private static int boxid;
	
	
	//		private static int boxid;
	
	public double volume()
	{
		wdth=10;
		height=10;
		depth=10;
		double temp;
		temp= wdth* height*depth;
		
		return temp;
	}
	
	public static void main(String[] args) {
		
		TC002_variable obj = new TC002_variable();

System.out.print("value of object : "+obj.volume());
		

		
		
	}

}
