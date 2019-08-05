package codex;

public class prob7 {
        public static boolean isprime(int a)
         {
          boolean status=true;
           for(int i=3;i<=Math.sqrt(a);i+=2;
             {
                if(a%i==0)
                 {
                   status=false;
                    break;
                  }
              }
            return status;
          }

	public static void main(String[] args) {
		int n=1;
                 for(int i=3;i>0;i+=2)
                   {
                      if(isprime(i)==true)
                        {
                          n++;
		         }
		       if(n==10001)
			{
				System.out.println("10001st prime number is:"+i);
				break;
			}
		   }
	  }

  }
