public class Pillai_Prob2{public static void main(String[] args){
	long one=0, two=1, three=0, total=0;
	for(total=0; two<4000000; total+=0){
		three=one+two;
		total+=addifeven(three);
		one=two+three;
		total+=addifeven(one);
		two=three+one;
		total+=addifeven(two);}

	System.out.println(total);}



	public static long addifeven(long x){
		if((x%2)==0)
			return x;
		else
			return 0;}}


