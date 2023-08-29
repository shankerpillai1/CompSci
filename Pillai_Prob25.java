import java.math.BigInteger;

public class Pillai_Prob25{
	public static void main(String [] args){
		int index=3;
		BigInteger b1=BigInteger.valueOf(1),b2=BigInteger.valueOf(1),b3=BigInteger.valueOf(2);
		boolean isDone=false;

		for(int i=0; !isDone; i++){
			b1=b2.add(b3);
			index++;
			checkDone(b1, index);
			b2=b3.add(b1);
			index++;
			checkDone(b2, index);
			b3=b1.add(b2);
			index++;
			checkDone(b3, index);
		}
	}


	public static void checkDone(BigInteger b, int index){
		String s=""+b+"";
		if(s.length()==1000){
			System.out.println(index);
			System.exit(0);
		}
	}
}