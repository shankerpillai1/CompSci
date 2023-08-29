public class Pillai_Prob35{public static void main(String [] args){int counter=4;
for(int i=2; i<1000000; i++){
	if(isPrime(i)){
		if(isPrime(/**/((i%10)*10)+(i/10))){
			counter++;
			System.out.println(counter);}}}



/*System.out.println(counter);*/	}

public static boolean isPrime(int x){
		boolean b=true;
		for(int i=x-1; i>1; i--){
			if((x%i)==0)
				b=false;
			}
		return b;}}










