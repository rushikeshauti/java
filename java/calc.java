import Day3java.TCinterface;

interface simplecalc
{
	int add(int a, int b);
	
}
public class calc implements simplecalc{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		calc c = new calc();
System.out.println(c.add(10,10));
	}

	@Override
	public int add(int a, int b) {
		int c=a+b;
		return c;
	}

}
