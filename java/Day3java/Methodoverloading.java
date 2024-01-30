package Day3java;

public class Methodoverloading {

	Methodoverloading(){
		System.out.println("1 st overloaded properly ");
	}
	Methodoverloading( int value){
		
		System.out.println("2 st overloaded properly : "+value);
	}
	
	
	
	
	
	public static void main(String[] args) {
		//
		Methodoverloading sc= new	Methodoverloading();
		
		Methodoverloading loading2 = new	Methodoverloading(80);
		
		
		//System.out.println("2nd time value :"+loading2 );
		//System.out.println(sc);
	//	System.out.println(loading2);
	//	System.out.println(loading2);
		
	}

}
