public class Pillai_Prob5
{
	public static void main(String[] args)
	{
		for(long i=2520; i<990000000; i+=2520){
			for(long j=11; j<22; j++){
				if((i%j)!=0){
					j=22;
				}
				if(j==20){
					System.out.println(i);
					System.exit(0);
				}
			}
		}
	}
}





