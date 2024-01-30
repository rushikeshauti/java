package pac2;
public class lab93 {
	public static void replacespec(String str) {
	        int length = str.length();   
	        for (int i = 0; i < length; i++)    
	        {   
	            if (i%2!=0)   
	            {   
	            	System.out.print("#");  
	            }   else
	            {
	            	System.out.print(str.charAt(i));
	            }
	        }   
	    }   
	    public static void main(String[] args)   
	    {   
	        String str = "invisible";     
	        replacespec(str);   
	}
}
