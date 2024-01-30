package jan_pac1;

public class EXconst {

	int mathmarks;
	int scimarks;
	int engmarks;
	EXconst(int math,int sci, int eng)
	{
		this.mathmarks=math;
		this.scimarks=sci;
		this.engmarks=eng;
	}
	public void total()
	{
		int totalmarks;
		totalmarks=mathmarks+scimarks+engmarks;
		System.out.print("Total marks is:"+totalmarks);
	}
}
