package Practice;
//Program to reverse a string 
public class StringReverse {

	public static void main(String[] args) {
		
		String s="rahul";
		String t ="";
		/*for ( int i=s.length()-1;i>=0;i--)
		{
			System.out.println(s.charAt(i));
		}*/
		for ( int i=s.length()-1;i>=0;i--)
		{
			t=t+s.charAt(i);
			
		}
		System.out.println(t);
		

	}

}
