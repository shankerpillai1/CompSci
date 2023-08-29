import java.math.BigInteger;

public class Pillai_Prob20{
	public static void main(String[] args){
		BigInteger b=BigInteger.valueOf(100),c;
		int total=0;

		for(int i=99; i>0; i--){
			c=BigInteger.valueOf(i);
			b=b.multiply(c);
		}

		String s=""+b+"";

		for(int i=0; i<s.length(); i++){
			total+=(Integer.parseInt(s.substring(i, i+1)));
		}

		System.out.println(total);

	}
}
