package codex;
import java.math.BigInteger;
public class prob16 {

	public static void main(String[] args) {
		BigInteger b=new BigInteger("2").pow(1000);
		char c[]=b.toString().toCharArray();
		int sum=0;
		for(char a:c)
		{
			sum+=Character.getNumericValue(a);
		}
		System.out.println(sum);
      
	}

}
