package codex;

public class prob7 {

	public static void main(String[] args) {
		int flag,n=10001,c=0;
		for(long i=2;i<=1000000;i++)
		{
			flag=0;
			for(long j=2;j<=i/2;j++)
			{
				if(i%j==0)
				{
					flag=1;
					break;
				}
			}
			if(flag==0)
				c++;
			if(c==n)
			{
				System.out.println(i);
				break;
			}
		}
	}

}
