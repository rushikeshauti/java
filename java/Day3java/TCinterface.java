package Day3java;

public class TCinterface {
 interface simplecalc
{
	int add(int a, int b);
	
}
class calc implements simplecalc
{
	public int add(int a, int b) {
		return a+ b;
	}
}
}


//class TCinterface implements simplecalc


	//public static void main(String[] args) {
//calc cal=new calc();
//cal.add(10, 20);
	


