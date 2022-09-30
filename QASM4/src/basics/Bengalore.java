package basics;

public class Bengalore {

	public static void main(String[] args) {
		char[] s="BENGALORE*".toCharArray();
		int n=4;
		int a=0;
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				if (i>=j)
				{
					if(a<=s.length)
					{
						System.out.print(s[a]+ " ");
						a++;
					}
				}
					
		
			}
			System.out.println();	
		}
				
	}
}

	
