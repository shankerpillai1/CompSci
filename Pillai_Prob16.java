import java.math.BigInteger;

public class Pillai_Prob16{
	public static void main(String[] args){
		BigInteger b=BigInteger.valueOf(2);
		b=b.pow(1000);
		String s=""+b+"";
		int sum=0;

		for(int i=0; i<s.length();i++){
			sum+=(Integer.parseInt(s.substring(i,i+1)));
		}

		System.out.println(sum);
	}
}