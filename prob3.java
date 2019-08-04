package codex;

public class prob3 {
	public static int largeprimefactor(long n)
	{
		int i;
		for(i=2;i<=n;i++)
		{
			if(n%i==0)
			{
				n/=i;
				i--;
			}
		}
		return i;
	}
	
	public static void main(String[] args) {
		long n=600851475143l;
		
System.out.println(largeprimefactor(n));
	}

}
