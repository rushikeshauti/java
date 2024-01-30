package Day4java;
import java.util.Scanner;
class AgeException extends Exception{
	private int age;
	AgeException(int a){
		age=a;
	}
	public String toString() {
		return age+" : is an invalid age";
	}
}
class emp{
	String name;
	int age;
	void getempdetails() throws AgeException
	{
		System.out.print("Enter your name :");
		Scanner sc=new Scanner(System.in);
		name=sc.nextLine();
		System.out.print("Enter your age :");
		Scanner sc1=new Scanner(System.in);
		age=sc1.nextInt();
		if(age<16) {
			throw new AgeException (age);
		}else {
			System.out.println("is an valid age : "+age);
		}
	}
}
public class userdefineExc {
	public static void main(String[] args) {
try {
	emp e1=new emp();
	e1.getempdetails();
}catch(AgeException e)
{
	System.out.println(e);
}
	}
}
