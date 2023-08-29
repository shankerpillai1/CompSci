import java.math.BigInteger;

public class Pillai_Prob30{
	public static void main(String [] args){
		int sum=0;
		double n2=0;
		boolean done=false;
		String s;

		for(int i=10; i<1000000; i++){
			s=""+i+"";

			for(int j=0; j<s.length(); j++){
				n2+=(Math.pow(Integer.parseInt(s.substring(j, j+1)),5));
			}

			if(((int)n2)==i){
				System.out.println(n2);
				sum+=i;
			}
			n2=0;
		}
		System.out.println(sum);
	}
}



