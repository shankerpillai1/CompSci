import java.math.BigInteger;

public class Pillai_Prob48{public static void main(String [] args){
	BigInteger b=BigInteger.valueOf(0),c;
	String l;

	for(int i=1; i<1001; i++){
		c=BigInteger.valueOf(i);
		c=c.pow(i);
		b=b.add(c);
	}

	System.out.println(b);
}}