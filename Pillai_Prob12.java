public class Pillai_Prob12{public static void main(String[] args){
	int counter =1,divisors=0;
	for(int i=1; i<1000000; i+=counter){
		counter++;

		if(i>1000){
			for(int j=(int)(i/2); j>0; j--){
				if((i%j)==0){
					divisors++;
				}
			}

			if(divisors>=150){
				System.out.print(i);
				System.exit(0);
			}

			divisors=0;
		}
	}
}}
