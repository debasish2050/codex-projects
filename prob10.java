package codex;

public class prob10 {
	public static boolean prime(int n)
	{
		boolean status=true;
		for(int i=3;i<=Math.sqrt(n);i+=2)
		{
			if(n%i==0)
			{
				status=false;
				break;
			}
		}
		return status;
	}

	public static void main(String[] args) {
		long sum=0;
		for(int i=3;i<=2000000;i+=2)
		{
			if(prime(i))
				sum+=i;
		}
    System.out.println("The sum is:"+(sum+2));
	}

}
