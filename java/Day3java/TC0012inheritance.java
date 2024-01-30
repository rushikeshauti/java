package Day3java;

//public class TC0012inheritance {

	
	class Parent_P{
		public void parent() {
			System.out.println("Hello 2024");
		}
	}
	class child_C extends Parent_P{
	//	@override
		public void Child() {
			super.parent();   // we call super keyword
			System.out.println("Hello 2025");
		}
		
	}
	
	
	public class TC0012inheritance {
	
	public static void main(String[] args) {
		
		child_C sc=new child_C();
		
			//sc.parent();
				sc.Child();
				
				
				if(sc instanceof Parent_P ) {
					
					System.out.println(" It is a instance : Yes ");
				}else {
					System.out.println(" It is a instance : NO");
				}
	}

}
