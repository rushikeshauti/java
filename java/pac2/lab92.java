package pac2;
public class lab92 {
		    public static void removeDuplicates(String str)   
		    {   
		        String newstr = new String();   
		        int length = str.length();   
		        for (int i = 0; i < length; i++)    
		        {   
		            char charAtPosition = str.charAt(i);    
		            if (newstr.indexOf(charAtPosition) < 0)   
		            {   
		                newstr += charAtPosition;   
		            }   
		        }   
		        System.out.println("After duplicate word remove : "+newstr);  
		    }   
		    public static void main(String[] args)   
		    {   
		        String str = "invisiblen";     
		        removeDuplicates(str);   
	}

}
