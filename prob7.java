package codex;

public class prob7 {

	public static void main(String[] args) {
		int flag,n=10001,c=0;
		for(long i=3;i<=1000000;i+=2)
		{
			flag=0;
			for(long j=2;j<=Math.sqrt(i);j++)
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
