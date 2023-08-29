import java.math.BigInteger;
public class Pillai_Prob10{public static void main(String[] args){
	BigInteger b=BigInteger.valueOf(17);
	BigInteger c;
	int sum=0;
	for(int i=11; i<2000000; i+=2)
	{
		c=BigInteger.valueOf(i);
		if((i%5)==0)
			sum+=0;
		else if(isPrime(i)){
			System.out.println(c);
			b=b.add(c);
		}
	}
	System.out.println(b);

}


public static boolean isPrime(int d){
	boolean p=true;

	for(int i=3; i<((int)(d/2));i+=2)
	{
		if((d%i)==0)
		{
			p=false;
			break;
		}
	}


	/*if(p==true)
		System.out.println(d);*/

	return p;

}

}