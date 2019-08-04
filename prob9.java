package codex;

public class prob9 {

	public static void main(String[] args) {
		double product;
		for(int i=3;i<=1000;i++)
		{
			for(int j=i+1;j<1000;j++)
			{
				double c_square=Math.pow(i,2)+Math.pow(j,2);
				double c=Math.pow(c_square,0.5);
				if(i+j+c==1000)
				{
				product=i*j*c;
				System.out.println((int)product);
				break;
				}
			}
		}

	}

}
