package codex;

public class prob6 {

	public static void main(String[] args) {
		int sum1=0,sum2=0,n=100;
		sum1=(n*(n+1))/2;
		sum2=(n*(n+1)*(2*n+1))/6;
		int diff=(sum1*sum1)-sum2;
		System.out.println("The difference is:"+diff);

	}

}
