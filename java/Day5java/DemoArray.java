package Day5java;

public class DemoArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Array Declaration
	int arr[];
	arr= new int[2];
		
	arr[0]=2;
	arr[1]=5;
	
	System.out.println(arr[0]);	
	System.out.println(arr[1]);	
	System.out.println(arr.length);	
	
	//for each loop
	int arr22[]= {1,2,3,4,5};
	
	for(int i : arr22)
	{
		System.out.println(i);
	}
	
	//for loop
	int arr23[]= {1,2,3,4,5};
	
	for(int i=0;i<arr23.length;i++)
	{
		
		System.out.println("for loop : "+arr23[i]);	
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
		int arr1[] ={1,2,3,4,5};
		
	//two diemention
		
		String twodim[][]=new String[2][2];
		System.out.println("Two dim length :"+twodim.length);	

	twodim[0][0]="Apple";
	twodim[0][1]="Apple123";
	twodim[1][0]="Ap";
	twodim[1][1]="Apple1234";
	
	System.out.println("Two dim value :"+twodim[0][1]);	
	}

}
