package codex;

public class prob5 {
	public static long gcd(long a,long b)
	{
		if(a%b!=0)
			return gcd(b,a%b);
		else
				return b;
	}
	public static long lcm(int n)
	{
		long ans=1;
		for(long i=1;i<=n;i++)
		{
			ans=(ans * i)/(gcd(ans,i));
		}
		return ans;
	}
	
	public static void main(String[] args) {
		int n=20;
		System.out.println(lcm(n));
	}

}
