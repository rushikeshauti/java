package pac2;

public class lab94upp {

	public static void replaceupp(String str) {
        int length = str.length();   
        for (int i = 0; i < length; i++)    
        {   
            if (i%2!=0)   
            {   
            	System.out.print(str.toUpperCase().charAt(i));
            //	System.out.print("#");  
            }   else
            {
            //	System.out.print(str.toUpperCase(i));
            	System.out.print(str.charAt(i));
            }
        }   
    }   
    public static void main(String[] args)   
    {   
        String str = "invisible";     
        replaceupp(str);   
}
		

	
}
