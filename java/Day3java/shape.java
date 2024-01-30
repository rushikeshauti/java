package Day3java;

abstract class shapes 
	{
		abstract void draw();
	}
	class rect extends shapes
	{
	 @Override
		void draw() {
			System.out.print("Draw the Rectangle");
		}
	}
	public class shape{
	
	public static void main(String[] args) {
		rect r1=new rect();
		r1.draw();
	
	}

}
