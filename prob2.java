package codex;

public class prob2 {

	public static void main(String[] args) {
		int num1=0,num2=1,sum=0,temp;
		while(num2<4000000)
		{
			temp=num2;
			num2=num1+num2;
			num1=temp;
		
			if(num2%2==0)
			{
				sum+=num2;
			}
		}
      System.out.println("SUM="+sum);
	}

}
