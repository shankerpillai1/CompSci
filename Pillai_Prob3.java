public class Pillai_Prob3{public static void main(String [] args){
	double x=2, largestprimefactor=1;
	boolean isprime=false;
	for(x=3; x<600851475143.0; x+=2){
		for(double i=2; i<x; i++){
			if((x%i)==0)
				isprime=false;
			else
				isprime=true;}
		if(isprime)
			if((600851475143.0%x)==0)
				largestprimefactor=x;}

	System.out.println(largestprimefactor);}}



