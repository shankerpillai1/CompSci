public class Pillai_Prob7{public static void main(String [] args){
	int primecounter=1;
	long num=0;
	for(long i=3; primecounter<10001; i++){
	/*if((i%2)!=0&&(i%3)!=0&&(i%5)!=0&&(i%7)!=0)*/
		if(isPrime(i)){
			num=i;
			primecounter++;
			System.out.println(num);}}

	/*System.out.println(num)*/;}


	public static boolean isPrime(long x){
		boolean b=true;
		for(long i=x-1; i>1; i--){
			if((x%i)==0)
				b=false;
			}
		return b;}}


