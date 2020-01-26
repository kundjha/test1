package Practice;

public class twoDarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[][]=new int[2][2];
		a[0][0]=2;
		a[0][1]=3;
		a[1][0]=1;
		a[1][1]=5;
		int j=0;
		int min=a[0][0];
        for(int i=0;i<2;i++)
        {
        	for(j=0;j<2;j++)
        	{
        		System.out.println(a[i][j]);
        		if(min>a[i][j])
        		{
        			min=a[i][j];
        		}
        	
        	}
        	
        	
        	
        }
        System.out.println(min);
	}

}
