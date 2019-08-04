package codex;

public class prob4 {
	public static boolean palindrome(int p)
	{
		int temp=p;
		int rev=0;
		while(p>0)
		{
			int r=p%10;
			rev=rev*10+r;
			p/=10;
		}
		if(temp==rev)
			return true;
		else 
			return false;
	}

	public static void main(String[] args) {
		int pmax=0;
		for(int i=100;i<=999;i++)
		{
			for(int j=100;j<=999;j++)
			{
				int p=i*j;
				if(palindrome(p) && p>pmax)
				{
					pmax=p;
				}
			}
		}
       System.out.println(pmax);
	}

}
