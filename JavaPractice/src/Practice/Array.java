package Practice;

public class Array {

	public static void main(String[] args) {
		
		//Return Sum of arrays
		int a[]= {1,2,3,4,5};
		int sum=0;
		
		for(int i=0;i<a.length;i++)
		{
			sum=sum+a[i];
			
			//Find the index of 4 
			if(a[i]==4)
			{
				System.out.println("Index of 4 is "+i);
				break;
			}
			
		}
		System.out.println("The sum is"+sum);

	}

}
