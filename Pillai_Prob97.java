import java.math.BigInteger;

public class Pillai_Prob97{
	public static void main(String [] args){
		/*BigInteger b=BigInteger.valueOf(7830457);
		BigInteger c=BigInteger.valueOf(2);
		BigInteger b1=BigInteger.valueOf(2);
		b1=b1.pow(b);
		System.out.println(b1);
		BigInteger b2=BigInteger.valueOf(28433);
		BigInteger b3=BigInteger.valueOf(1);
		b1=b1.multiply(b2);
		b1=b1.add(b3);
		String s=""+b1+"";
		System.out.println(s.substring(s.length()-10,s.length()));*/
		int n1=1, n2=1, n3=1, n4=1;
		double average= n1+n2+n3+n4/(double)4;
		System.out.println(average);
	}
}
