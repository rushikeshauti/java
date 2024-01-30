package pac2;

public class TC009_String {

	public static void main(String[] args) {
		
		String str1 = new String("pooja");
		String str2 = new String("ketan");

		System.out.println("String1 :"+str1 + "____________string2 :"+str2);
		
		String str3 = new String("pooja");
		String str4=str3;	
		System.out.println("String3 :"+str3 + "_____________string4  :"+str4);
		
		System.out.println("length :"+str1.length());
		
		System.out.println("indexof :"+str1.indexOf("j"));
		
		String ok = "This is beautiful day";
		
		System.out.println(ok.trim()+"kk");
		System.out.println(ok.substring(8,17));
	
		System.out.println(ok.toUpperCase());
		
		System.out.println(ok.toLowerCase());
	
		System.out.println(ok.equals(str1));
		
		System.out.println(ok==str1);
		
		StringBuffer s2 = new StringBuffer("welcome");
		
		System.out.println(s2.append(" to 2024"));
		
		System.out.println(str2.concat(" to 2024"));
		
		
		
		
		
		
	}

}
